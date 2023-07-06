package com.example.moviescreens.screens

import FakeImageList
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import card
import com.example.moviescreens.R
import com.example.moviescreens.composeables.blurredIcon
@Preview
@Composable
fun MovieDetailsScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Box(
            Modifier
                .weight(0.4f)
        )
        {
            card()
            blurredIcon(icon = R.drawable.vector)
            Box(
                modifier = Modifier
                    .padding(top = 38.dp, end = 16.dp)
                    .background(Color.Gray.copy(alpha = 0.6f), RoundedCornerShape(16.dp))
                    .align(Alignment.TopEnd)
            ) {
                Box {
                    Text(
                        text = stringResource(id = R.string.clock),
                        color = Color.White,
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
                        contentDescription = stringResource(id = R.string.clock),
                        modifier = Modifier.padding(
                            top = 5.dp,
                            bottom = 4.dp,
                            start = 4.dp,
                            end = 4.dp
                        )
                    )
                }
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(56.dp)
                    .align(Alignment.Center),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF4500)
                ),
                shape = CircleShape,
                contentPadding = PaddingValues(12.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.play),
                    contentDescription = stringResource(id = R.string.play),
                    Modifier.padding(4.dp)
                )
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    Color.White,
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
        ) {
            Box(modifier = Modifier.weight(1f)) {
                Row {
                    Text(
                        text = stringResource(R.string._6_4),
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(top = 32.dp, start = 32.dp)
                    )

                    Text(
                        text = stringResource(R.string._10),
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(top = 32.dp)
                    )
                }
            }

            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string._63),
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .align(Alignment.Center)
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Row {
                    Text(
                        text = "4/",
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 32.dp, start = 48.dp)

                    )

                    Text(
                        text = "10",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(top = 32.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.imbd),
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 8.dp, start = 42.dp)

                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.rottentomatoes),
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .align(Alignment.Center)
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.ign),
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(top = 8.dp, end = 54.dp)
                        .align(Alignment.TopEnd)
                )
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text(
            text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            Arrangement.spacedBy(8.dp)
        ) {
            Box {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.height(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp),
                    elevation = ButtonDefaults.buttonElevation(4.dp),
                )
                {
                    Text(
                        text = stringResource(R.string.fantasy),
                        color = Color.Black,
                        fontSize = 14.sp,
                    )
                }
            }
            Box {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.height(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp),

                    elevation = ButtonDefaults.buttonElevation(4.dp),
                )
                {
                    Text(
                        text = stringResource(R.string.action_text),
                        color = Color.Black,
                        fontSize = 14.sp,
                    )
                }
            }
        }

        val fakeImages = listOf(
            R.drawable.prince,
            R.drawable.images,
            R.drawable.images,
            R.drawable.prince,
            R.drawable.catchme,
            R.drawable.prince,
            R.drawable.prince,
        )

        Spacer(modifier = Modifier.padding(12.dp))
        FakeImageList(fakeImages = fakeImages)
        Spacer(modifier = Modifier.padding(12.dp))

        Text(
            text = stringResource(R.string.fantastic_beasts_is_a_film_series_directed_by_david_yates_and_a_spin_off_prequel_to_the_harry_potter_novel_and_film_series_the_series_is_distributed_by_warner_bros_and_consists_of_three_fantasy_films_as_of_2022),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFF4500)
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.card),
                contentDescription = stringResource(R.string.play),
                Modifier.padding(4.dp)
            )
            Text(text = stringResource(R.string.booking), color = Color.White)

        }
    }
}