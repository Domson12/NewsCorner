package eu.tuto.newscorner.data.repository.dataSourceImpl

import eu.tuto.newscorner.data.api.NewsAPIService
import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class RemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getToHeadlines(country, page)
    }
}