package eu.tuto.newscorner.data.repository.dataSourceImpl

import eu.tuto.newscorner.data.api.NewsAPIService
import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse> {
        return newsAPIService.getToHeadlines(country, page)
    }
}