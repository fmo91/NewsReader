package com.example.newsreader.di

import com.example.newsreader.model.repositories.ArticlesRepository
import com.example.newsreader.model.repositories.ArticlesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun articlesRepository(repo: ArticlesRepositoryImpl): ArticlesRepository
}