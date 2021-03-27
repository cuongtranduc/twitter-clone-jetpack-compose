package com.example.twitterclonejetpackcompose.data

data class Tweet(
    val userName: String = "cuongtd_",
    val displayName: String = "cuongtd",
    val profileUrl: String = "https://graph.facebook.com/945387882269493/picture?type=large",
    val numberOfComments: Number = 92,
    val numberOfRetweet: Number = 10,
    val numberOfLikes: Number = 10,
    val content: String = "blah blah blah. blah blah blah .blah blah blah ." +
            " blah blah blahblah blah blahblah blah blahblah blah blah",
    val media: String = "",
)
