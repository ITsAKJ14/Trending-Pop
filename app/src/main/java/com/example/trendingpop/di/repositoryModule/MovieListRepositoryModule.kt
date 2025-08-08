package com.example.trendingpop.di.repositoryModule

import com.example.trendingpop.data.repository.MovieListRepositoryImp
import com.example.trendingpop.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class MovieListRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImp: MovieListRepositoryImp
    ): MovieListRepository


}