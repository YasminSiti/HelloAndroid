package com.yasmin.belajarandroid.model

data class NewsData (
    val articles:List<Article>,
    val status: String,
    val totalResults: Int
)