package com.example.twitterclonejetpackcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.twitterclonejetpackcompose.ui.navigaton.Route
import com.example.twitterclonejetpackcompose.ui.navigaton.Routes
import com.example.twitterclonejetpackcompose.ui.screen.*

@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(navController, startDestination = Route.Home.route) {
        Routes.forEach {
            composable(it.route, content = it.content)
        }
    }
}