package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}