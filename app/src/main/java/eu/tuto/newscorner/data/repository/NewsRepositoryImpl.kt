package eu.tuto.newscorner.data.repository

import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.model.Article
import eu.tuto.newscorner.data.repository.dataSource.NewsRemoteDataSource
import eu.tuto.newscorner.data.util.Resource
import eu.tuto.newscorner.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource
) : NewsRepository {
    override suspend fun getNewsHeadlines(): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}