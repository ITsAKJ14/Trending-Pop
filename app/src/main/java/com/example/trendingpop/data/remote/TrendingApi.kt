package com.example.trendingpop.data.remote

import com.example.trendingpop.domain.model.trending.Trendings
import retrofit2.http.GET
import retrofit2.http.Query

interface TrendingApi {
    @GET("trending/all/day")
    suspend fun getTrending(@Query("api_key") apiKey: String):Trendings
}