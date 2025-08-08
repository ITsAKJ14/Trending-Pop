package com.example.trendingpop.data.repository

import arrow.core.Either
import com.example.trendingpop.common.Constants
import com.example.trendingpop.common.MovieCategory
import com.example.trendingpop.data.mapper.toNetworkError
import com.example.trendingpop.data.remote.MovieListApi
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.movieList.Movies
import com.example.trendingpop.domain.repository.MovieListRepository
import javax.inject.Inject

class MovieListRepositoryImp @Inject constructor(
    private val api: MovieListApi
) : MovieListRepository {
    override suspend fun getMovieList(category: MovieCategory): Either<NetworkError, Movies> =
        Either.catch {
            api.getMovieList(category = category.value, apiKey = Constants.API_KEY)
        }.mapLeft { it.toNetworkError() }

}