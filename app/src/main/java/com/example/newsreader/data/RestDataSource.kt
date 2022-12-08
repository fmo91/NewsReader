package com.example.newsreader.data

import com.example.newsreader.model.entities.ApiResponse
import retrofit2.http.GET

interface RestDataSource {

    @GET("/everything?q=Apple&from=2022-12-08&sortBy=popularity&apiKey=1f62e8efc964404a99af235645135eb1")
    suspend fun getArticles(): ApiResponse

}