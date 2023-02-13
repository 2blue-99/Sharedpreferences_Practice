package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.edit
import com.example.sharedpreferences.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.e("TAG", "onCreate: ${App.prefs.test}", )
        binding.button.setOnClickListener{
            App.prefs.test = "gimoti"
            Log.e("TAG", "onCreate: ${App.prefs.test}", )
        }
        binding.button2.setOnClickListener{
            App.prefs.clear()
            Log.e("TAG", "onCreate: ${App.prefs.test}", )
        }
    }
}

//        var pureum = getSharedPreferences("pureum", MODE_PRIVATE)
//        Log.e("TAG", "onCreate: ${pureum.getString("test","err").toString()}")
//
//        binding.button.setOnClickListener{
//            pureum.edit {
//                putString("test", "gimoti")
//            }
//            Log.e("TAG", "onCreate: ${pureum.getString("test", "err").toString()}")
//        }
//
//        binding.button2.setOnClickListener {
//            Log.e("TAG", "onCreate: ${pureum.edit().clear().apply()}", )
//        }