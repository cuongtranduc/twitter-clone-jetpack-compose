package com.example.twitterclonejetpackcompose.ui.theme

import android.os.Build
import android.view.View
import android.view.Window
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = TwitterBlue,
    primaryVariant = Color.Black,
    secondary = TwitterGray,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = TwitterGray,
    onBackground = Color.Black,
    onSurface = Color.Black,
    error = Red800,
)

private val LightColorPalette = lightColors(
    primary = TwitterBlue,
    primaryVariant = Color.White,
    secondary = TwitterGray,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.Black,
    onSecondary = TwitterGray,
    onBackground = Color.Black,
    onSurface = Color.White,
    error = Red800,
)

@Composable
fun TwitterCloneJetpackComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    CompositionLocalProvider(
        LocalPaddings provides Padding()
    ) {
        MaterialTheme(
            colors = colors,
            typography = com.example.twitterclonejetpackcompose.ui.theme.Typography,
            shapes = Shapes,
            content = content
        )
    }
}

object MyCustomTheme {
    val colors: Colors
        @Composable
        get() = MaterialTheme.colors

    val typography: androidx.compose.material.Typography
        @Composable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val paddings: Padding
        @Composable
        get() = LocalPaddings.current
}