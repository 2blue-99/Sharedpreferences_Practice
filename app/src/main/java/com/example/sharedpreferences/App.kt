package com.example.sharedpreferences

import android.app.Application

/**
 * 2023-02-13
 * pureum
 */
class App : Application() {
    companion object{
        lateinit var prefs : MySharedPreferences
    }

    override fun onCreate() {
        prefs = MySharedPreferences(applicationContext)
        super.onCreate()
    }
}