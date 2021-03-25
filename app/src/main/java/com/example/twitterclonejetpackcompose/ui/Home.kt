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

@Composable
fun Home(openDrawer: () -> Unit) {
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Column(Modifier.fillMaxHeight()) {
        AppTopBar(openDrawer = openDrawer)
        Divider(color = Color.LightGray, thickness = 0.25.dp)
        Box(Modifier.weight(1f))
        Box(Modifier) {
            AppBottomBar()
        }
    }
}

@Composable
fun Screen1Component(openDrawer: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Screen 1 Title") },
            navigationIcon = {
                IconButton(onClick = openDrawer) {
                    Icon(imageVector = Icons.Filled.Menu, null)
                }
            }
        )
        Surface(color = Color(0xFFffd7d7.toInt()), modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                content = {
                    Text(text = "Screen 1")
                }
            )
        }
    }
}
