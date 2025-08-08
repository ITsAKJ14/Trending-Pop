package com.example.trendingpop.data.repository

import arrow.core.Either
import com.example.trendingpop.common.Constants
import com.example.trendingpop.data.mapper.toNetworkError
import com.example.trendingpop.data.remote.GenreApi
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import com.example.trendingpop.domain.model.movieGenre.MovieGenres
import com.example.trendingpop.domain.model.tvGenre.TvGenres
import com.example.trendingpop.domain.repository.GenresRepository
import javax.inject.Inject

class GenresRepositoryImp @Inject constructor(
    private val api: GenreApi
) : GenresRepository {
    override suspend fun getMoveGenres(): Either<NetworkError, MovieGenres> =
        Either.catch {
            api.getMoveGenres(Constants.API_KEY)
        }.mapLeft { it.toNetworkError() }


    override suspend fun getTvGenres(): Either<NetworkError, TvGenres> =
        Either.catch {
            api.getTvGenres(Constants.API_KEY)
        }.mapLeft { it.toNetworkError() }
}
