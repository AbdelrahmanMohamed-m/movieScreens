package com.example.moviescreens.composeables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviescreens.R

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun pager() {
    HorizontalPager(
        pageCount = pages.size,
        contentPadding = PaddingValues(start = 32.dp, end = 32.dp),
        pageSpacing = 16.dp,

    ) { page ->
        Card(
            modifier = Modifier
                .aspectRatio(4f / 5f).graphicsLayer {
                    val pageOffset =(PagerState)

                }

        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                painter = painterResource(pages[page]),
                contentDescription = "pics"
            )
        }
    }
}

    val pages = listOf(
        R.drawable.mage,
        R.drawable.beat,
        R.drawable.aqua,
    )
