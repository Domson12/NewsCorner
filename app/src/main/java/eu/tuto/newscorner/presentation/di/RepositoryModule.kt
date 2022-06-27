package eu.tuto.newscorner.presentation.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.tuto.newscorner.data.repository.NewsRepositoryImpl
import eu.tuto.newscorner.data.repository.dataSource.NewsRemoteDataSource
import eu.tuto.newscorner.domain.repository.NewsRepository

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}