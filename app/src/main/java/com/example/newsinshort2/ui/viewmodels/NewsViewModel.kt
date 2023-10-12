package com.example.newsinshort2.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsinshort2.AppConstants
import com.example.newsinshort2.data.entity.NewsResponse
import com.example.newsinshort2.ui.repositories.NewsRepository
import com.example.utilities.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepository: NewsRepository): ViewModel() {

    private val _newsState: MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
    val newsState: StateFlow<ResourceState<NewsResponse>> = _newsState

    init {
        getNews(AppConstants.COUNTRY)
        Log.d(TAG, "inside NewsViewModel")
    }

    private fun getNews(country: String) {
        viewModelScope.launch(Dispatchers.IO) {
            newsRepository.getNewsHeadline(country).collectLatest { newsResponse ->
                _newsState.value = newsResponse
            }
        }
    }

    companion object{
        const val TAG = "NewsViewModel"
    }

}