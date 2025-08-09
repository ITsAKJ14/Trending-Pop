package com.example.trendingpop.domain.model.uiState

import com.example.trendingpop.domain.model.movieGenre.Genre
import com.example.trendingpop.domain.model.trending.Result

data class TrendingScreenStates(
    val isLoading: Boolean=false,
    val trending: List<Result> =emptyList(),
    val movieGenres: List<Genre> = emptyList(),
    val groupedMoviesByGenre: Map<String, List<Result>> = emptyMap(),
    val error: String? =null
)
