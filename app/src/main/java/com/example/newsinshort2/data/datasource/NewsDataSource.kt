package com.example.newsinshort2.data.datasource

import com.example.newsinshort2.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {
    suspend fun getNewsHeadline(country: String) : Response<NewsResponse>
}