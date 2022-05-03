package com.example.meditationuiyoutubetheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationuiyoutubetheme.ui.HomeScreen
import com.plcoding.meditationuiyoutube.ui.theme.MeditationUIYoutube

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIYoutube {
                HomeScreen()
            }
        }
    }
}

