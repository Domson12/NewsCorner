package eu.tuto.newscorner.domain.repository

import androidx.lifecycle.LiveData
import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.model.Article
import eu.tuto.newscorner.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Resource<APIResponse>

    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}