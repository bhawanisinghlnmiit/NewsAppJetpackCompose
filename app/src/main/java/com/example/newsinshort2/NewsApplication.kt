package com.example.newsinshort2

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp // entry point, this is the first step when user will launch application
class NewsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"Inside NewsApplication")
    }

    companion object {
        const val TAG = "NewsApplication"
    }
}