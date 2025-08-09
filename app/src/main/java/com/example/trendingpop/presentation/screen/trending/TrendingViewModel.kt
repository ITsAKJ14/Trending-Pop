package com.example.trendingpop.presentation.screen.trending

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trendingpop.domain.model.trending.Result
import com.example.trendingpop.domain.model.uiState.TrendingScreenStates
import com.example.trendingpop.domain.repository.GenresRepository
import com.example.trendingpop.domain.repository.TrendingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TrendingViewModel @Inject constructor(
    private val genreRepository: GenresRepository,
    private val trendingRepository: TrendingRepository
): ViewModel() {

    private val _state = MutableStateFlow(TrendingScreenStates())
    val state = _state.asStateFlow()


    init {
        getTopRatedWithGenre()
    }

    fun getTopRatedWithGenre() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }
            val genresDeferred = async { genreRepository.getMoveGenres() }
            val moviesDeferred =
                async { trendingRepository.getTrending() }

            val genresResult = genresDeferred.await()
            val moviesResult = moviesDeferred.await()

            genresResult.onRight { result ->
                _state.update { it.copy(movieGenres = result.genres) }
            }.onLeft { error ->
                _state.update { it.copy(error = error.error.msg) }
            }
            moviesResult.onRight { result ->
                _state.update { it.copy(trending = result.results) }
            }.onLeft { error ->
                _state.update { it.copy(error = error.error.msg) }
            }
            val groupedMovies = groupMoviesByGenre()
            _state.update { it.copy(groupedMoviesByGenre = groupedMovies) }
            _state.update { it.copy(isLoading = false) }
        }
    }

    private fun groupMoviesByGenre(): Map<String, List<Result>> {
        val genresMap = state.value.movieGenres.associateBy { it.id }

        return state.value.trending
            .flatMap { movie ->
                movie.genre_ids.mapNotNull { genreId ->
                    genresMap[genreId]?.name?.let { genreName ->
                        genreName to movie
                    }
                }
            }
            .groupBy({ it.first }, { it.second })
    }

}