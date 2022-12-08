package com.example.newsreader.model.entities

import java.time.LocalDate

data class Article(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: LocalDate,
    val content: String,
)