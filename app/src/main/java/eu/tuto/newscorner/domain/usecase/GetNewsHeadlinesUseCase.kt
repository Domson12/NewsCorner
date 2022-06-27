package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.data.model.APIResponse
import eu.tuto.newscorner.data.util.Resource
import eu.tuto.newscorner.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines()
    }
}