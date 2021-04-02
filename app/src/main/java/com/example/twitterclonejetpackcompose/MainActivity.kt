package com.example.twitterclonejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.core.view.WindowCompat
import com.example.twitterclonejetpackcompose.ui.MainScreen
import com.example.twitterclonejetpackcompose.ui.theme.TwitterCloneJetpackComposeTheme
import com.google.accompanist.insets.ProvideWindowInsets

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            TwitterCloneJetpackComposeTheme {
                Surface() {
                    ProvideWindowInsets {
                        MainScreen()
                    }
                }
            }
        }
    }
}
