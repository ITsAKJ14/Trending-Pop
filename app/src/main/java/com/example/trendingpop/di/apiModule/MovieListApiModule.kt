package com.example.trendingpop.di.apiModule

import com.example.trendingpop.common.Constants
import com.example.trendingpop.data.remote.MovieListApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object MovieListApiModule {
    @Provides
    @Singleton
    fun provideMovieListApi(): MovieListApi =
        Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(MovieListApi::class.java)
}