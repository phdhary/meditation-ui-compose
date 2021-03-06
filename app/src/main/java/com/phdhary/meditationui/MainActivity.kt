package com.phdhary.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.phdhary.meditationui.ui.HomeScreen
import com.phdhary.meditationui.ui.theme.MeditationUITheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {
                HomeScreen()
            }
        }
    }
}