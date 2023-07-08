package com.example.moviescreens.composeables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.zIndex


@Composable
fun MovieBackGround(
    data: Int,
    modifier: Modifier = Modifier,
    color: Color
) {
    Box(modifier = Modifier.background(Color.White)) {
        val painter = painterResource(id = data)

        Image(
            painter = painter,
            contentDescription = "Movie Image",
            contentScale = ContentScale.Crop,
            modifier = modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1F)
                .background(brush = Brush.verticalGradient(listOf(Color.Transparent, color),
                    startY = 0F,
                    endY = 500F)
                )
        )
    }
}