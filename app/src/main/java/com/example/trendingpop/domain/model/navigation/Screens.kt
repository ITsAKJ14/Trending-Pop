package com.example.trendingpop.domain.model.navigation

import com.example.trendingpop.R
import com.example.trendingpop.common.MovieCategory

sealed class Screens(
    val route: String,
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int
) {
    object NowPlayingScreen : Screens(
        route = MovieCategory.NOW_PLAYING.value,
        title = "Now Playing",
        selectedIcon = R.drawable.now_selected,
        unselectedIcon = R.drawable.now_unselected
    )

    object PopularScreen : Screens(
        route = MovieCategory.POPULAR.value,
        title = "Popular",
        selectedIcon = R.drawable.popular_selected,
        unselectedIcon = R.drawable.popular_unselected
    )

    object TopRatedScreen : Screens(
        route = MovieCategory.TOP_RATED.value,
        title = "Top Rated",
        selectedIcon = R.drawable.top_rated_selected,
        unselectedIcon = R.drawable.top_rated_unselected
    )

    object TrendingScreen : Screens(
        route = MovieCategory.TRENDING.value,
        title = "Trending",
        selectedIcon = R.drawable.trending_selected,
        unselectedIcon = R.drawable.trending_unselected
    )

}
