package com.example.trendingpop.data.remote

import com.example.trendingpop.domain.model.movieList.Movies
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieListApi {
    @GET("movie/{category}")
    suspend fun getMovieList(
        @Path("category") category: String,
        @Query("api_key") apiKey: String
    ): Movies
}


