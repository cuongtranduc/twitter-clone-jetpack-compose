package com.example.twitterclonejetpackcompose.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.twitterclonejetpackcompose.data.Story
import com.google.accompanist.coil.CoilImage

val Stories: ArrayList<Story> = arrayListOf(
    Story(
        "Elon Musk",
        "https://images.mktw.net/im-311693?width=620&size=1.4382022471910112"
    ),
    Story("Thanos", "https://i.insider.com/5ae75d4ebd967122008b4623?width=100"),
    Story(),
    Story("Thanos", "https://i.insider.com/5ae75d4ebd967122008b4623?width=100"),
    Story(),
    Story("Thanos", "https://i.insider.com/5ae75d4ebd967122008b4623?width=100"),
    Story(),
    Story(
        "Elon Musk",
        "https://images.mktw.net/im-311693?width=620&size=1.4382022471910112"
    ),
    Story(),
)

@Composable
fun StoryList() {
    LazyRow(
        modifier = Modifier
            .padding(top = 10.dp)
    ) {
        item {
            CreateStoryCompose()
        }
        items(items = Stories) {
            Story(it)
        }
    }
    Divider(
        modifier = Modifier.padding(top = 5.dp),
        color = Color.LightGray,
        thickness = 0.25.dp
    )
}

@Composable
fun CreateStoryCompose() {
    Box(
        modifier = Modifier
            .padding(start = 15.dp, end = 18.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .height(55.dp)
                    .clip(shape = CircleShape),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                CoilImage(
                    data = Story().profileUrl,
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .width(50.dp)
                        .clip(shape = CircleShape),
                )
            }
            Text(
                "Add",
                fontSize = 14.sp,
                color = MaterialTheme.colors.secondary,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .absoluteOffset(38.dp, 36.dp)
                .size(16.dp),
            border = BorderStroke(2.dp, MaterialTheme.colors.background),
            shape = CircleShape,
            contentPadding = PaddingValues(0.dp),
        ) {
            Icon(
                imageVector = Icons.Sharp.Add,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(14.dp)
                    .background(MaterialTheme.colors.primary)
            )
        }

    }
}

@Composable
fun Story(story: Story) {
    Column(
        modifier = Modifier
            .padding(end = 12.dp)
            .width(55.dp)
    ) {
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(55.dp),  //avoid the oval shape
            shape = CircleShape,
            border = BorderStroke(1.5.dp, MaterialTheme.colors.primary),
            contentPadding = PaddingValues(3.5.dp),
        ) {
            CoilImage(
                data = story.profileUrl,
                contentDescription = "Profile Image",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .width(50.dp)
            )
        }
        Text(
            story.username,
            fontSize = 14.sp,
            color = MaterialTheme.colors.secondary,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
    }
}