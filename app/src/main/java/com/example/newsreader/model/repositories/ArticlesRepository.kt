package com.example.newsreader.model.repositories

import com.example.newsreader.model.entities.Article
import java.time.LocalDate

interface ArticlesRepository {
    suspend fun getArticles() : List<Article>
}

class DefaultArticlesRepository() : ArticlesRepository {
    override suspend fun getArticles(): List<Article> {
        return listOf(
            Article(
                author = "Lily Hay Newman",
                title = "Apple Kills Its Plan to Scan Your Photos for CSAM. Here’s What’s Next",
                description = "The company plans to expand its Communication Safety features, which aim to disrupt the sharing of child sexual abuse material at the source.",
                url = "https://www.wired.com/story/apple-photo-scanning-csam-communication-safety-messages/",
                urlToImage = "https://media.wired.com/photos/639000b143ab6f113787af35/191:100/w_1280,c_limit/security-apple-encryption-photos.jpg",
                publishedAt = LocalDate.parse("2018-12-12"),
                content = "In August 2021, Apple announced a plan to scan photos users stored in iCloud for child sexual abuse material (CSAM). The scheme was meant to be privacy-preserving and allow the company to flag potent… [+5321 chars]",
            ),
            Article(
                author = "Lily Hay Newman2",
                title = "Mango Kills Its Plan to Scan Your Photos for CSAM. Here’s What’s Next",
                description = "The company plans to expand its Communication Safety features, which aim to disrupt the sharing of child sexual abuse material at the source.",
                url = "https://www.wired.com/story/apple-photo-scanning-csam-communication-safety-messages/",
                urlToImage = "https://media.wired.com/photos/639000b143ab6f113787af35/191:100/w_1280,c_limit/security-apple-encryption-photos.jpg",
                publishedAt = LocalDate.parse("2018-12-12"),
                content = "In August 2021, Apple announced a plan to scan photos users stored in iCloud for child sexual abuse material (CSAM). The scheme was meant to be privacy-preserving and allow the company to flag potent… [+5321 chars]",
            ),
            Article(
                author = "Lily Hay Newman3",
                title = "Banana Kills Its Plan to Scan Your Photos for CSAM. Here’s What’s Next",
                description = "The company plans to expand its Communication Safety features, which aim to disrupt the sharing of child sexual abuse material at the source.",
                url = "https://www.wired.com/story/apple-photo-scanning-csam-communication-safety-messages/",
                urlToImage = "https://media.wired.com/photos/639000b143ab6f113787af35/191:100/w_1280,c_limit/security-apple-encryption-photos.jpg",
                publishedAt = LocalDate.parse("2018-12-12"),
                content = "In August 2021, Apple announced a plan to scan photos users stored in iCloud for child sexual abuse material (CSAM). The scheme was meant to be privacy-preserving and allow the company to flag potent… [+5321 chars]",
            ),
        )
    }
}