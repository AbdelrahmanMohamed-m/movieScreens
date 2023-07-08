package com.example.moviescreens.screens.home

import HomeViewModel
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.moviescreens.R
import com.example.moviescreens.composeables.GenreButton
import com.example.moviescreens.composeables.MovieBackGround
import com.example.moviescreens.composeables.TopChips
import com.example.moviescreens.composeables.Watch
import com.example.moviescreens.composeables.bottombarItem
import com.example.moviescreens.composeables.pager
import com.example.moviescreens.composeables.spacer16

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = 1)
    HomeDetails(state = state, pagerState = pagerState)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeDetails(
    state: HomeUiState,
    pagerState: PagerState
) {

    Box(
        modifier = Modifier
            .fillMaxSize()   ) {

        MovieBackGround(
            data = state.movieImages[pagerState.currentPage],
            color = Color.White
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                Modifier.padding(top = 48.dp, start = 40.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {

                TopChips(
                    text = stringResource(R.string.now_showing),
                    onSelectedChipChanged = {})
                TopChips(
                    text = stringResource(R.string.coming_soon),
                    onSelectedChipChanged = {},
                    isSelected = true
                )
            }

            pager(
                data = state.movieImages,
                state = pagerState
            )
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

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}











