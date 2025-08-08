package com.example.trendingpop.di.repositoryModule

import com.example.trendingpop.data.repository.TrendingRepositoryImp
import com.example.trendingpop.domain.repository.TrendingRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class TrendingRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindTrendingRepository(
        trendingRepositoryImp: TrendingRepositoryImp
    ): TrendingRepository
}