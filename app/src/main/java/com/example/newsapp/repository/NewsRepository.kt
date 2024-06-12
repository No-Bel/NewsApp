package com.example.newsapp.repository

import com.example.newsapp.storage.local.ArticleDatabase
import com.example.newsapp.storage.network.RetrofitNews

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitNews.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitNews.api.searchForNews(searchQuery, pageNumber)
}