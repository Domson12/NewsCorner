package eu.tuto.newscorner.domain.repository

import androidx.lifecycle.LiveData
import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.model.Article
import eu.tuto.newscorner.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>

}