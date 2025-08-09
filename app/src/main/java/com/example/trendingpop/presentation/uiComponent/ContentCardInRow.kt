package com.example.trendingpop.presentation.uiComponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.trendingpop.R
import com.example.trendingpop.domain.model.movieList.Result



@Composable
fun ContentInRow(
    genre: String,
    movies: List<Result>,
    isLoading: Boolean
) {

    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = if (isLoading) "Loading..." else genre,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xff222831),
                modifier = Modifier.padding(start = 5.dp, top = 8.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                items(movies.size) {
                    val movie = movies[it]
                    val posterUrl = "https://image.tmdb.org/t/p/w500${movie.poster_path}"

                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(posterUrl)
                            .placeholder(R.drawable.picture)
                            .crossfade(true)
                            .build(),

                        contentDescription = movie.title,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 140.dp, height = 200.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                    )


                }
            }

        }

    }


}


@Composable
fun TrendingContentInRow(
    genre: String,
    movies: List<com.example.trendingpop.domain.model.trending.Result>,
    isLoading: Boolean
) {

    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = if (isLoading) "Loading..." else genre,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xff222831),
                modifier = Modifier.padding(start = 5.dp, top = 8.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                items(movies.size) {
                    val movie = movies[it]
                    val posterUrl = "https://image.tmdb.org/t/p/w500${movie.poster_path}"

                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(posterUrl)
                            .placeholder(R.drawable.picture)
                            .crossfade(true)
                            .build(),

                        contentDescription = movie.title,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 140.dp, height = 200.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                    )


                }
            }

        }

    }


}