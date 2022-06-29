package eu.tuto.newscorner.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.tuto.newscorner.data.repository.NewsRepositoryImpl
import eu.tuto.newscorner.data.repository.dataSource.NewsLocalDataSource
import eu.tuto.newscorner.data.repository.dataSource.NewsRemoteDataSource
import eu.tuto.newscorner.domain.repository.NewsRepository
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource)
    }
}