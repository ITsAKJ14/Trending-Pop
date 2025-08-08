package com.example.trendingpop.domain.repository

import arrow.core.Either
import com.example.trendingpop.common.MovieCategory
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.movieList.Movies


interface MovieListRepository {
    suspend fun getMovieList(category: MovieCategory): Either<NetworkError, Movies>
}