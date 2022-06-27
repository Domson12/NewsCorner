package eu.tuto.newscorner.domain.usecase

import eu.tuto.newscorner.data.model.Article
import eu.tuto.newscorner.data.util.Resource
import eu.tuto.newscorner.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}