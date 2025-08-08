package com.example.trendingpop.di.repositoryModule

import com.example.trendingpop.data.repository.GenresRepositoryImp
import com.example.trendingpop.domain.repository.GenresRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class GenresRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindGenresRepository(
        genresRepositoryImp: GenresRepositoryImp
    ): GenresRepository

}