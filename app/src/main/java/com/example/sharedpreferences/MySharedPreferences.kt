package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

/**
 * 2023-02-13
 * pureum
 */
class MySharedPreferences(context: Context) {
    private val prefs:SharedPreferences = context.getSharedPreferences("mymy",0)
    var test: String?
        get() = prefs.getString("pureum","err")
        set(value) = prefs.edit().putString("pureum", value).apply()

    fun clear(){
        prefs.edit().clear().apply()
    }
}