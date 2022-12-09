package com.example.newsreader.di

import com.example.newsreader.data.RestDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    @Named("baseUrl")
    fun provideBaseUrl(): String = "https://newsapi.org/v2/"

    @Singleton
    @Provides
    fun provideRetrofit(@Named("baseUrl") baseUrl: String): Retrofit {
        return Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideRestDataSource(retrofit: Retrofit): RestDataSource =
        retrofit.create(RestDataSource::class.java)
}