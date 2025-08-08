package com.example.trendingpop.data.repository

import arrow.core.Either
import com.example.trendingpop.common.Constants
import com.example.trendingpop.data.mapper.toNetworkError
import com.example.trendingpop.data.remote.TrendingApi
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.trending.Trendings
import com.example.trendingpop.domain.repository.TrendingRepository
import javax.inject.Inject

class TrendingRepositoryImp @Inject constructor(
    private val api: TrendingApi
) : TrendingRepository {
    override suspend fun getTrending(): Either<NetworkError, Trendings> =
        Either.catch {
            api.getTrending(Constants.API_KEY)
        }.mapLeft { it.toNetworkError() }

}

