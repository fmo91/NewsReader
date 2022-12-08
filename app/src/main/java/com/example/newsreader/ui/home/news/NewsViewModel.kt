package com.example.newsreader.ui.home.news

import androidx.lifecycle.ViewModel
import com.example.newsreader.model.entities.Article
import com.example.newsreader.model.repositories.ArticlesRepository
import com.example.newsreader.model.repositories.DefaultArticlesRepository
import kotlinx.coroutines.flow.MutableStateFlow

class NewsViewModel: ViewModel() {
    private val repository: ArticlesRepository = DefaultArticlesRepository()
    val articlesFlow = MutableStateFlow<List<Article>>(listOf())

    suspend fun loadArticles() {
        articlesFlow.value = repository.getArticles()
    }
}