package com.example.twitterclonejetpackcompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.ui.theme.TwitterBlue

@Composable
fun AppTopBar(openDrawer: () -> Unit = {}) {
    TopAppBar(
        elevation = 0.dp,
        backgroundColor = Color(0xFFFFFF),
        title = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_twitter),
                    null,
                    modifier = Modifier.size(20.dp),
                    tint = Color.Unspecified
                )
            }

        },
        navigationIcon = {
            IconButton(onClick = openDrawer) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    null,
                    modifier = Modifier.size(24.dp),
                    tint = TwitterBlue
                )
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_trends),
                    null,
                    modifier = Modifier.size(24.dp),
                    tint = Color.Unspecified
                )
            }
        }
    )
}