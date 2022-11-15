package com.yasmin.belajarandroid.ui.theme


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yasmin.belajarandroid.model.Article
import com.yasmin.belajarandroid.network.Api
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {

    init {
        getListNews()
    }

    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            response.articles.forEach{ article:Article ->
                Log.d("response", article.toString())
            }
        }
    }
}
