package com.example.twitterclonejetpackcompose.ui.navigaton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

val bottomNavigationItems = listOf(
    Route.Home,
    Route.Search,
    Route.Notification,
    Route.Message
)

@Composable
fun AppBottomBar(navController: NavHostController) {
    val currentRoute = currentRoute(navController)

    Column() {
        Divider(
            color = Color.LightGray,
            thickness = 0.25.dp
        )
        BottomNavigation(
            modifier = Modifier,
            elevation = 0.dp,
            backgroundColor = MaterialTheme.colors.background
        ) {
            bottomNavigationItems.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            null,
                            modifier = Modifier.size(if ("Home" == item.route) 24.dp else 20.dp),
                            tint = if (currentRoute == item.route) MaterialTheme.colors.primary else Color.Unspecified
                        )
                    },
                    selected = currentRoute == item.route,
                    onClick = {
                        if (currentRoute != item.route) {
                            navController.navigate(item.route)
                        }
                    }
                )
            }
        }
    }
}
