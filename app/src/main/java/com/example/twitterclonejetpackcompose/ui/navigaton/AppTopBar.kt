package com.example.twitterclonejetpackcompose.ui.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Composable
fun AppTopBar(scaffoldState: ScaffoldState) {
    Column() {
        TopAppBar(
            elevation = 0.dp,
            backgroundColor = Color(0xFFFFFF),
            title = {
                Column(
                    modifier = Modifier
                        .padding(start = 0.dp, end = 20.dp)
                        .fillMaxWidth(),
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
                IconButton(
                    onClick = {
                        GlobalScope.launch(Dispatchers.Main) { scaffoldState.drawerState.open() }
                    },
                    modifier = Modifier
                ) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        null,
                        modifier = Modifier.size(24.dp),
                        tint = TwitterBlue
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = {}, modifier = Modifier
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_trends),
                        null,
                        modifier = Modifier.size(24.dp),
                        tint = Color.Unspecified
                    )
                }
            }
        )
        Divider(color = Color.LightGray, thickness = 0.25.dp)
    }
}