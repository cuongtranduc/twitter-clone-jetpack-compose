package com.example.twitterclonejetpackcompose.ui.drawer

import androidx.compose.runtime.Composable
import com.example.twitterclonejetpackcompose.ui.Home


@Composable
fun BodyContentComponent(
    currentScreen: DrawerAppScreen,
    openDrawer: () -> Unit
) {
    when (currentScreen) {
        DrawerAppScreen.Home -> Home(
            openDrawer
        )
    }
}