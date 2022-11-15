package com.yasmin.belajarandroid.network

import com.yasmin.belajarandroid.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET("top-headlines?country=us&apiKey=c83ec143352d439692f3371641cbc03c")
    suspend fun getTopHeadline(): NewsData
}

object Api {
    val newsAPIService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}