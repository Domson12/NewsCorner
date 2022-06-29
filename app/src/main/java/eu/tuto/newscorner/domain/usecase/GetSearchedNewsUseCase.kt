package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.util.Resource
import eu.tuto.newscorner.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}