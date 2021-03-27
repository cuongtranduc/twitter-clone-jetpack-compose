package com.example.twitterclonejetpackcompose.ui.tweet

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.twitterclonejetpackcompose.data.Tweet
import com.example.twitterclonejetpackcompose.ui.CreateStoryCompose
import com.example.twitterclonejetpackcompose.ui.Stories
import com.example.twitterclonejetpackcompose.ui.Story

val tweets = listOf(
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
    Tweet(),
)

@Composable
fun TweetList() {
    val listState = rememberLazyListState()

    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(
            top = 10.dp,
            bottom = 10.dp
        )
    ) {
        itemsIndexed(items = tweets) { index, item ->
            TweetCompose(index, item)
        }
    }
}

@Composable
fun Seperator() {

}