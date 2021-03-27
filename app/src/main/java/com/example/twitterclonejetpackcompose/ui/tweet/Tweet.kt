package com.example.twitterclonejetpackcompose.ui.tweet

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclonejetpackcompose.R
import com.example.twitterclonejetpackcompose.data.Tweet
import com.example.twitterclonejetpackcompose.ui.theme.TwitterGray
import com.google.accompanist.coil.CoilImage

//val tweet = Tweet()

@Composable
fun TweetCompose(index: Int, tweet: Tweet, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        if (index != 0) {
            Divider(
                modifier = Modifier
                    .padding(vertical = 10.dp),
                color = Color.LightGray,
                thickness = 0.25.dp
            )
        }
        Row(modifier = Modifier.padding(horizontal = 12.dp)) {
            CoilImage(
                data = tweet.profileUrl,
                contentDescription = "Profile Image",
                modifier = Modifier
                    .width(55.dp)
                    .clip(shape = CircleShape)
            )

            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        tweet.displayName,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        " @" + tweet.userName,
                        color = TwitterGray,
                    )
                }
                Text(tweet.content, modifier = Modifier.padding(top = 5.dp))
                IconRow(tweet)
            }
        }
    }
}

@Composable
fun IconRow(tweet: Tweet) {
    Row(modifier = Modifier.padding(top = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(R.drawable.ic_comment),
                null,
                modifier = Modifier.size(16.dp),
                tint = TwitterGray
            )
            Text(" " + tweet.numberOfComments.toString(), fontSize = 14.sp, color = TwitterGray)
        }
        Row(
            modifier = Modifier.padding(start = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_retweet),
                null,
                modifier = Modifier.size(20.dp),
                tint = TwitterGray
            )
            Text(" " + tweet.numberOfRetweet.toString(), fontSize = 14.sp, color = TwitterGray)
        }
        Row(
            modifier = Modifier.padding(start = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_like),
                null,
                modifier = Modifier.size(16.dp),
                tint = TwitterGray
            )
            Text(" " + tweet.numberOfLikes.toString(), fontSize = 14.sp, color = TwitterGray)
        }
        Row(
            modifier = Modifier.padding(start = 40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_share),
                null,
                modifier = Modifier.size(16.dp),
                tint = TwitterGray
            )
        }
    }
}