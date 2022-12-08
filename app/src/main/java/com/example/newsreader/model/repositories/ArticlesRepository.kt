package com.example.newsreader.model.repositories

import com.example.newsreader.data.RestDataSource
import com.example.newsreader.model.entities.Article
import java.time.LocalDate
import javax.inject.Inject

interface ArticlesRepository {
    suspend fun getArticles() : List<Article>
}

class ArticlesRepositoryImpl @Inject constructor (
    private val dataSource: RestDataSource,
) : ArticlesRepository {
    override suspend fun getArticles(): List<Article> {
        return dataSource.getArticles().articles
    }
}