package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.data.model.Article
import eu.tuto.newscorner.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}