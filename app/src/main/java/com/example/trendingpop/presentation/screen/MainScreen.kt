package com.example.trendingpop.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.trendingpop.domain.model.navigation.Screens
import com.example.trendingpop.presentation.navigationComponent.NavigationGraph


@Composable
fun MainScreen(navController: NavHostController) {

    val items = listOf(
        Screens.NowPlayingScreen,
        Screens.PopularScreen,
        Screens.TopRatedScreen,
        Screens.TrendingScreen
    )
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            NavigationBar(
                tonalElevation = 5.dp,
                containerColor = Color(0xffDDDDDD)
            ) {
                items.forEach { item ->
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color(0x4000ADB5),
                            unselectedIconColor = Color(0xffA6E3E9),
                            selectedIconColor = Color(0xff00ADB5),
                            selectedTextColor = Color.Black, unselectedTextColor = Color(0xff222831)
                        ),
                        selected = item.route == currentRoute,
                        label = {
                            Text(text = item.title)
                        },
                        icon = {
                            Icon(
                                painter = painterResource(id = if (currentRoute == item.route) item.selectedIcon else item.unselectedIcon),
                                contentDescription = item.route,
                                modifier = Modifier.size(24.dp),
                                tint = Color(0xff00ADB5),

                                )
                        },
                        onClick = {
                            if (item.route != currentRoute) {
                                navController.navigate(item.route) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }

                        }
                    )

                }
            }
        }
    ) {
        Surface(modifier = Modifier.padding(it)){
        NavigationGraph(navController = navController)

        }

    }

}