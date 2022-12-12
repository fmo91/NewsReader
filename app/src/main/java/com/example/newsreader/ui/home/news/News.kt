package com.example.newsreader.ui.home.news

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newsreader.R
import com.example.newsreader.ui.base.NewsTopBar
import com.example.newsreader.ui.home.news.components.ArticleRow

@Composable
fun News(
    viewModel: NewsViewModel = hiltViewModel()
) {
    val articles = viewModel.articlesFlow.collectAsState().value

    LaunchedEffect(key1 = Unit) {
        viewModel.loadArticles()
    }

    Container {
        LazyColumn {
            items(articles) { article ->
                ArticleRow(article = article)
            }
        }
    }
}

@Composable
fun Container(
    content: @Composable () -> Unit
) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            NewsTopBar()
        }
    ) {
        content()
    }
}