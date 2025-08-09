package com.example.trendingpop.common

import com.example.trendingpop.BuildConfig

object Constants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
const val API_KEY= BuildConfig.API_KEY

}
enum class MovieCategory(val value: String) {
    NOW_PLAYING("now_playing"),
    POPULAR("popular"),
    TOP_RATED("top_rated"),
    UPCOMING("upcoming"),
    TRENDING("trending")
}
