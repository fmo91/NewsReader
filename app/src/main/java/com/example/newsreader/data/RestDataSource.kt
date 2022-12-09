package com.example.newsreader.data

import com.example.newsreader.model.entities.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RestDataSource {

    @GET("everything")
    suspend fun getArticles(
        @Query("q") query: String,
        @Query("from") fromDate: String,
        @Query("sortBy") sortBy: String,
    ): ApiResponse

}