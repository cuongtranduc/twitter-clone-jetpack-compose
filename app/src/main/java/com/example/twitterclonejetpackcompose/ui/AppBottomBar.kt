package com.example.twitterclonejetpackcompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.ui.theme.TwitterBlue

val listItems =
    listOf(
        R.drawable.ic_home,
        R.drawable.ic_search,
        R.drawable.ic_notifications,
        R.drawable.ic_dm
    )

@Composable
fun AppBottomBar() {
    var selectedIndex by remember { mutableStateOf(0) }
    BottomNavigation(
        modifier = Modifier,
        backgroundColor = Color(0xFFFFFFFF)
    ) {
        listItems.forEachIndexed { index, id ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = id),
                        null,
                        modifier = Modifier.size(if (R.drawable.ic_home == id) 24.dp else 20.dp),
                        tint = if (selectedIndex == index) TwitterBlue else Color.Unspecified
                    )
                },
                selected = selectedIndex == index,
                onClick = { selectedIndex = index }
            )
        }
    }
}
