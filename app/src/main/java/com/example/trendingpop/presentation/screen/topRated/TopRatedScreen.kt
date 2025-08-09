package com.example.trendingpop.presentation.screen.topRated

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.trendingpop.domain.model.uiState.NowPlayingStates
import com.example.trendingpop.presentation.uiComponent.ContentInRow

@Composable
internal fun TopRatedScreen(
    viewModel: TopRatedViewModel = hiltViewModel()


    ) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    TopRatedContent(state)
}

@Composable
fun TopRatedContent(states: NowPlayingStates) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xffF9F7F7)
    ) {
        LazyColumn(
            Modifier
                .fillMaxSize()
                .padding(it)
                .background(color = Color(0xffF9F7F7))
        ) {
            states.groupedMoviesByGenre.forEach {(genre,movies)->
                item {
                    ContentInRow(genre,movies,states.isLoading)
                }


            }
        }
    }
}