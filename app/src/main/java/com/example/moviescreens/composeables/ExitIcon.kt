package com.example.moviescreens.composeables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun blurredIcon(
    modifier: Modifier = Modifier,
    icon: Int
) {
    Box(
        modifier = Modifier
            .padding(top = 32.dp, start = 16.dp)
            .background(Color.White.copy(alpha = 0.2f), RoundedCornerShape(16.dp))
            .clickable { }
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "exit",
            Modifier.padding(4.dp)
        )
    }
}
