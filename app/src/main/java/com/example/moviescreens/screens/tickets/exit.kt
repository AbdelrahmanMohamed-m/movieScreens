package com.example.moviescreens.screens.tickets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ExitPainter(primaryPainter: Painter, modifier: Modifier = Modifier) {
    Icon(
        painter = primaryPainter,
        contentDescription = null,
        tint = Color.White,
        modifier = modifier
            .clip(shape = CircleShape)
            .background(Color(0x4D969696))
            .padding(4.dp)
    )
}