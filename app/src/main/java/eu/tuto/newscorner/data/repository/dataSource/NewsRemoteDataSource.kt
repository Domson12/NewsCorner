package eu.tuto.newscorner.data.repository.dataSource

import eu.tuto.newscorner.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
}