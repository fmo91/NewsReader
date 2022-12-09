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
        @Query("apiKey") apiKey: String = "1f62e8efc964404a99af235645135eb1",
    ): ApiResponse

}