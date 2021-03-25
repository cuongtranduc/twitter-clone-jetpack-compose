package com.example.twitterclonejetpackcompose.ui.drawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


@Composable
fun DrawerAppComponent() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val currentScreen = remember { mutableStateOf(DrawerAppScreen.Home) }

    ModalDrawer(
        drawerState = drawerState,
        gesturesEnabled = drawerState.isOpen,
        drawerContent = {
            DrawerContent(
                currentScreen = currentScreen,
                closeDrawer = {
                    GlobalScope.launch(Dispatchers.Main) { drawerState.close() }
                }

            )
        }
    ) {
        BodyContentComponent(
            currentScreen = currentScreen.value,
            openDrawer = {
                GlobalScope.launch(Dispatchers.Main) { drawerState.open() }
            }
        )
    }
}

fun getScreenBasedOnIndex(index: Int) = when (index) {
    0 -> DrawerAppScreen.Home
    else -> DrawerAppScreen.Home
}

enum class DrawerAppScreen {
    Home,
}

@Preview
@Composable
fun DrawerAppComponentPreview() {
    DrawerAppComponent()
}