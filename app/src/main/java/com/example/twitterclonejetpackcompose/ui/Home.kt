package com.example.twitterclonejetpackcompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.ui.theme.TwitterBlue
import com.example.twitterclonejetpackcompose.ui.theme.TwitterBlue
import com.example.twitterclonejetpackcompose.ui.theme.TwitterGray
import com.example.twitterclonejetpackcompose.ui.tweet.TweetList

@Composable
fun Home(openDrawer: () -> Unit) {
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Column(Modifier.fillMaxHeight()) {
        AppTopBar(openDrawer = openDrawer)
        Divider(color = Color.LightGray, thickness = 0.25.dp)
        StoryList()
        Column(
            modifier = Modifier
                .padding(vertical = 12.dp, horizontal = 12.dp)
                .weight(1f)
        ) {
//            TweetList()
        }
        Box(Modifier) {
            AppBottomBar()
        }
    }
}