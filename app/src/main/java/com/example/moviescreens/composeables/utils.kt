package com.example.moviescreens.composeables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviescreens.R

@Composable
fun Watch() {
    Box(
    ) {
        Text(
            text = stringResource(R.string.clock),
            color = Color.Black,
            modifier = Modifier.padding(
                top = 4.dp,
                bottom = 4.dp,
                start = 22.dp,
                end = 4.dp
            ),
            fontSize = 12.sp
        )
        Icon(
            painter = painterResource(id = R.drawable.clock),
            tint = Color.LightGray,
            contentDescription = stringResource(R.string.clock_icon),
            modifier = Modifier.padding(
                top = 5.dp,
                bottom = 4.dp,
                start = 4.dp,
                end = 4.dp
            )
        )
    }
}





