package com.example.twitterclonejetpackcompose.ui.drawer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.data.User
import com.example.twitterclonejetpackcompose.ui.theme.TwitterBlue
import com.example.twitterclonejetpackcompose.ui.theme.TwitterGray
import com.google.accompanist.coil.CoilImage


val user = User()

data class Catalog(val rsKey: Int, val title: String)

val catalogList: ArrayList<Catalog> = arrayListOf(
    Catalog(R.drawable.ic_like, "Profile"),
    Catalog(R.drawable.ic_lists, "Lists"),
    Catalog(R.drawable.ic_topics, "Topics"),
    Catalog(R.drawable.ic_bookmarks, "Bookmarks"),
    Catalog(R.drawable.ic_moments, "Moments"),
)

@Composable
fun DrawerContent(
    currentScreen: MutableState<DrawerAppScreen>,
    closeDrawer: () -> Unit
) {
//    Column(modifier = Modifier.fillMaxSize()) {
//        for (index in DrawerAppScreen.values().indices) {
//            val screen = getScreenBasedOnIndex(index)
//            Column(Modifier.clickable(onClick = {
//                currentScreen.value = screen
//                closeDrawer()
//            }), content = {
//            })
//        }
//    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
        color = MaterialTheme.colors.background
    ) {
        Column() {
            ProfileContent(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp)
            )
            Divider(
                modifier = Modifier.padding(top = 20.dp),
                color = Color.LightGray,
                thickness = 0.25.dp
            )
            CatalogListContent(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            )
            BottomContent()
        }
    }
}

@Composable
fun ProfileContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        CoilImage(
            data = user.profileUrl,
            contentDescription = "Profile Image",
            modifier = Modifier
                .width(55.dp)
                .clip(shape = CircleShape)
        )
        Text(
            user.displayName,
            modifier = Modifier.padding(top = 7.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text("@" + user.userName, color = TwitterGray)
        Row(modifier = Modifier.padding(top = 15.dp)) {
            Row() {
                Text(user.following.toString(), fontWeight = FontWeight.Bold)
                Text(" Following", color = TwitterGray)
            }
            Row(modifier = Modifier.padding(start = 10.dp)) {
                Text(user.follower.toString(), fontWeight = FontWeight.Bold)
                Text(" Followers", color = TwitterGray)
            }
        }
    }
}

@Composable
fun CatalogListContent(modifier: Modifier) {
//    val items = mutableListOf<Catalog>(catalogList)
    Column(
        modifier = modifier
    ) {
        LazyColumn() {
            items(items = catalogList) {
                CataLogRow(
                    catalog = it,
                )
            }
            item {
                Divider(
                    modifier = Modifier.padding(vertical = 15.dp),
                    color = Color.LightGray,
                    thickness = 0.25.dp
                )
                Column(modifier = modifier.padding(horizontal = 25.dp)) {
                    Text(
                        text = "Settings and privacy",
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "Support Center",
                        modifier = Modifier.padding(vertical = 15.dp),
                        fontSize = 18.sp,
                    )
                }
            }
        }

    }
}

@Composable
fun CataLogRow(catalog: Catalog) {
    Row(
        modifier = Modifier.padding(vertical = 15.dp, horizontal = 25.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(catalog.rsKey), null,
            modifier = Modifier.size(22.dp),
            tint = TwitterGray
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = catalog.title,
            fontSize = 18.sp,
        )
    }
}

@Composable
fun BottomContent() {
    Column(modifier = Modifier) {
        Divider(
            modifier = Modifier,
            color = Color.LightGray,
            thickness = 0.25.dp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
        ) {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_theme),
                    null,
                    modifier = Modifier.size(24.dp),
                    tint = TwitterBlue
                )
            }
            Box(modifier = Modifier.weight(1F))
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_qrcode),
                    null,
                    modifier = Modifier.size(24.dp),
                    tint = TwitterBlue
                )
            }
        }
    }
}