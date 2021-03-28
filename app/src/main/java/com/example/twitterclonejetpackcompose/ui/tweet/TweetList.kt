package com.example.twitterclonejetpackcompose.ui.tweet

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.twitterclonejetpackcompose.data.Tweet

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