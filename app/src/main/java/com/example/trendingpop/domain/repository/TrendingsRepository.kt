package com.example.trendingpop.domain.repository

import arrow.core.Either
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.trending.Trendings


interface TrendingRepository {
    suspend fun getTrending(): Either<NetworkError, Trendings>

}