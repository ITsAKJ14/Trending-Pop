package com.example.trendingpop.presentation.navigationComponent

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trendingpop.domain.model.navigation.Screens
import com.example.trendingpop.presentation.screen.nowPlaying.NowPlayingScreen
import com.example.trendingpop.presentation.screen.popular.PopularScreen
import com.example.trendingpop.presentation.screen.topRated.TopRatedScreen
import com.example.trendingpop.presentation.screen.trending.TrendingScreen

@Composable
fun NavigationGraph(
    navController: NavHostController
){
    NavHost(navController=navController, startDestination = Screens.NowPlayingScreen.route){
        composable(Screens.NowPlayingScreen.route){ NowPlayingScreen() }
        composable(Screens.TrendingScreen.route){ TrendingScreen() }
        composable(Screens.PopularScreen.route){ PopularScreen() }
        composable(Screens.TopRatedScreen.route){ TopRatedScreen() }
    }

}