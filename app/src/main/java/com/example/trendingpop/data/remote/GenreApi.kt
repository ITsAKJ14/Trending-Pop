package com.example.trendingpop.data.remote

import com.example.trendingpop.domain.model.movieGenre.MovieGenres
import com.example.trendingpop.domain.model.tvGenre.TvGenres
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GenreApi {
    @GET("genre/movie/list")
    suspend fun getMoveGenres(
        @Query("api_key") apiKey: String
    ): MovieGenres

    @GET("genre/tv/list")
    suspend fun getTvGenres(
        @Query("api_key") apiKey: String
    ): TvGenres
}