package com.example.twitterclonejetpackcompose.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.twitterclonejetpackcompose.ui.navigation.AppNavigation
import com.example.twitterclonejetpackcompose.ui.navigation.AppTopBar
import com.example.twitterclonejetpackcompose.ui.navigaton.AppBottomBar
import com.example.twitterclonejetpackcompose.ui.navigaton.DrawerContent
import com.example.twitterclonejetpackcompose.ui.navigaton.Route
import com.example.twitterclonejetpackcompose.ui.navigaton.currentRoute

@Composable
fun Main() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Scaffold(
        bottomBar = {
            AppBottomBar(navController)
        },
        topBar = {
            AppTopBar(navController, scaffoldState)
        },
        drawerContent = {
            DrawerContent(navController, scaffoldState)
        },
        floatingActionButton = {
            FloatingButton(navController)
        },
        scaffoldState = scaffoldState
    ) {
        // ovoid bottom bar overlay content
        Column(modifier = Modifier.padding(bottom = 58.dp)) {
            AppNavigation(navController)
        }
    }
}

@Composable
fun FloatingButton(navController: NavHostController) {
    if (currentRoute(navController) == Route.Home.route) {
        NewTweetButton()
    }
    if (currentRoute(navController) == Route.Message.route) {
        NewMessageButton()
    }
}