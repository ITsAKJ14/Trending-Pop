package com.example.trendingpop.common

object Constants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val API_KEY = "4bddc2457c48dafbda46ddbb1d8c0633"

}
enum class MovieCategory(val value: String) {
    NOW_PLAYING("now_playing"),
    POPULAR("popular"),
    TOP_RATED("top_rated"),
    UPCOMING("upcoming")
}
