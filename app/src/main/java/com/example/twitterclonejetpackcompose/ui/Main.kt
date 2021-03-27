package com.example.twitterclonejetpackcompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.twitterclonejetpackcompose.ui.navigation.AppNavigation
import com.example.twitterclonejetpackcompose.ui.navigation.AppTopBar
import com.example.twitterclonejetpackcompose.ui.navigaton.AppBottomBar
import com.example.twitterclonejetpackcompose.ui.navigaton.DrawerContent

@Composable
fun Main() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Scaffold(
        bottomBar = {
            AppBottomBar(navController)
        },
        topBar = {
            AppTopBar(scaffoldState)
        },
        drawerContent = {
            DrawerContent(navController, scaffoldState)
        },
        scaffoldState = scaffoldState
    ) {
        // ovoid bottom bar overlay content
        Column(modifier = Modifier.padding(bottom = 58.dp)) {
            AppNavigation(navController)
        }
    }
}