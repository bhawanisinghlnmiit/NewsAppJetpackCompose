package com.example.newsinshort2.data.api

import com.example.newsinshort2.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country : String,
        @Query("apiKey") apiKey: String = "8b7a61d436b84b66ac8c0c07f79d4c30"
    ) : Response<NewsResponse>
}