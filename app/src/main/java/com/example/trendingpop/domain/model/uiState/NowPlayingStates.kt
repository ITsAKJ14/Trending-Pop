package com.example.trendingpop.domain.model.uiState

import com.example.trendingpop.domain.model.movieGenre.Genre
import com.example.trendingpop.domain.model.movieList.Result

data class NowPlayingStates(
    val isLoading: Boolean=false,
    val nowPlaying: List<Result> =emptyList(),
    val movieGenres: List<Genre> = emptyList(),
    val groupedMoviesByGenre: Map<String, List<Result>> = emptyMap(),
    val error: String? =null

)
