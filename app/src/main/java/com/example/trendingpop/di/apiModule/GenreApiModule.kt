package com.example.trendingpop.di.apiModule

import com.example.trendingpop.common.Constants
import com.example.trendingpop.data.remote.GenreApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GenreApiModule {
    @Provides
    @Singleton
    fun provideGenreApi(): GenreApi =
        Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(GenreApi::class.java)

}