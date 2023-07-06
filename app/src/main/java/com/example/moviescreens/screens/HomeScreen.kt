package com.example.moviescreens.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviescreens.R
import com.example.moviescreens.composeables.ButtonSelected
import com.example.moviescreens.composeables.ButtonUnselected
import com.example.moviescreens.composeables.GenreButton
import com.example.moviescreens.composeables.Watch
import com.example.moviescreens.composeables.bottombarItem
import com.example.moviescreens.composeables.pager
import com.example.moviescreens.composeables.spacer16

@Preview
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .paint(painter = painterResource(id = R.drawable.mage))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.Transparent, Color.White),
                    startY = 0f,
                    endY = 1500f
                )
            )
            .fillMaxSize()

    ) {
        Row(
            Modifier.padding(top = 48.dp, start = 56.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            ButtonSelected()
            ButtonUnselected()
        }
        spacer16()
        pager()
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            Arrangement.spacedBy(8.dp)
        ) {
            Watch()
        }
        spacer16()
        Text(
            text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        spacer16()
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            Arrangement.spacedBy(8.dp)
        ) {
            GenreButton()
        }
        spacer16()
        bottombarItem()

    }
}












