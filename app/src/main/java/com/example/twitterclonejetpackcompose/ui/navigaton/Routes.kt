package com.example.twitterclonejetpackcompose.ui.navigaton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.ui.screen.*


sealed class Route(
    val route: String,
    val icon: Int,
    val content: @Composable (backStackEntry: NavBackStackEntry) -> Unit = {}
) {
    object Home : Route("Home", R.drawable.ic_home, { backStackEntry -> HomeScreen() })
    object Search : Route("Search", R.drawable.ic_search, { backStackEntry -> SearchScreen() })
    object Notification : Route(
        "Notification",
        R.drawable.ic_notifications,
        { backStackEntry -> NotificationScreen() })

    object Message : Route("Message", R.drawable.ic_dm, { backStackEntry -> MessageScreen() })
    object Profile : Route("Profile", R.drawable.ic_profile, { backStackEntry -> ProfileScreen() })
    object Lists : Route("Lists", R.drawable.ic_lists, { backStackEntry -> ProfileScreen() })
    object Topics : Route("Topics", R.drawable.ic_topics, { backStackEntry -> ProfileScreen() })
    object Bookmarks : Route("Bookmarks", R.drawable.ic_bookmarks, { backStackEntry -> ProfileScreen() })
    object Moments : Route("Moments", R.drawable.ic_moments, { backStackEntry -> ProfileScreen() })
}

val Routes = listOf(
    // bottom
    Route.Home,
    Route.Search,
    Route.Notification,
    Route.Message,

    //drawer
    Route.Profile,
    Route.Lists,
    Route.Topics,
    Route.Bookmarks,
    Route.Moments
)

@Composable
public fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.arguments?.getString(KEY_ROUTE)
}