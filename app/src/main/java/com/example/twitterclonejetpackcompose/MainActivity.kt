package com.example.twitterclonejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.twitterclonejetpackcompose.ui.drawer.DrawerAppComponent
import com.example.twitterclonejetpackcompose.ui.theme.TwitterCloneJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterCloneJetpackComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    DrawerAppComponent()
                }
            }
        }
    }
}
