package com.example.trendingpop.domain.repository

import arrow.core.Either
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.movieGenre.MovieGenres
import com.example.trendingpop.domain.model.tvGenre.TvGenres

interface GenresRepository {
    suspend fun getMoveGenres(): Either<NetworkError,MovieGenres>
    suspend fun getTvGenres(): Either<NetworkError,TvGenres>
}