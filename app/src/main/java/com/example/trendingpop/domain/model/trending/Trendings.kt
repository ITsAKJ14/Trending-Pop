package com.example.trendingpop.domain.model.trending

data class Trendings(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)