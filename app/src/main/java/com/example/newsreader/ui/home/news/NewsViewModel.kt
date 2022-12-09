package com.example.newsreader.ui.home.news

import androidx.lifecycle.ViewModel
import com.example.newsreader.model.entities.Article
import com.example.newsreader.model.repositories.ArticlesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor (
    private val repository: ArticlesRepository
): ViewModel() {
    val articlesFlow = MutableStateFlow<List<Article>>(listOf())

    suspend fun loadArticles() {
        articlesFlow.value = repository.getArticles()
    }
}