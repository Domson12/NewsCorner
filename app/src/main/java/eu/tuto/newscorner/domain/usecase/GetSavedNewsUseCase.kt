package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}