package com.example.newsinshort2.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsinshort2.ui.components.Loader
import com.example.newsinshort2.ui.components.NewsList
import com.example.newsinshort2.ui.components.NewsRowComponent
import com.example.newsinshort2.ui.viewmodels.NewsViewModel
import com.example.utilities.ResourceState
import com.example.utilities.ResourceState.*

const val TAG = "HOME_SCREEN"
@OptIn(ExperimentalFoundationApi::class) @Composable
fun HomeScreen(
    viewModel: NewsViewModel = hiltViewModel()
){
    val newsRes by viewModel.newsState.collectAsState()

    val pagerState = rememberPagerState (
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        100
    }
    
    VerticalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ) {page ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            when (newsRes) {
                is Loading<*> -> {
                    Log.d(TAG, "inside loading")
                    Loader()
                }
                is Success<*> -> {
                    Log.d(TAG, "Inside Success")
                    val res = (newsRes as ResourceState.Success).data
                    Log.d(TAG, "inside success ${res.articles}")
                    if(res.articles.isNotEmpty())
                        NewsRowComponent(res.articles.get(page), page)
                }
                is Error<*> -> {
                    Loader()
                    val res = (newsRes as ResourceState.Error).data
                    Log.d(TAG, "inside Error $res")
                }
            }
        }
    }
}

