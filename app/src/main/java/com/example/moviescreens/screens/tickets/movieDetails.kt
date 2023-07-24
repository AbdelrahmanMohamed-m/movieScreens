package com.example.moviescreens.screens.tickets


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.moviescreens.R
import com.example.moviescreens.ui.theme.Orange


@Composable
fun TicketScreen(
    navController: NavHostController,
    viewModel: TicketViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    TicketContent(
        state = state,
        onClickByTicketButton = {
            navController.navigate("HomeScreen")
        }
    )
}

@Composable
fun TicketContent(
    state: TicketUiState,
    onClickByTicketButton: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        Column {
            ExitPainter(
                primaryPainter = painterResource(id = R.drawable.icon_exit),
                modifier = Modifier.padding(16.dp)
            )
            CinemaScreen(painter = painterResource(id = R.drawable.cinema_screen))
            CinemaSeats()
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SeatingsItem(text = "Available", color = White)
                SeatingsItem(text = "Taken", color = Gray)
                SeatingsItem(text = "Selected", color = Orange)
            }
        }

        Card(
            shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            colors = CardDefaults.cardColors(containerColor = White),
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {

            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(state.dates) { ItemDate(it) {} }
            }

            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.times) { ItemTime(it) }
            }

            Spacer(modifier = Modifier.weight(0.5f))

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "$10.00",
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp,
                    )
                    Text(
                        text = "1 Ticket",
                        color = Gray,
                        fontWeight = FontWeight.Normal
                    )
                }
                PrimaryButton(
                    painter = painterResource(id = R.drawable.icon_booking),
                    text = "Buy Tickets",
                    onClick = onClickByTicketButton
                )
            }
        }

    }
}

@Composable
fun PrimaryButton(painter: Painter, text: String, onClick: () -> Unit) {
    Button(
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(containerColor = Orange),
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
        Text(text = text,  fontWeight = FontWeight.Medium)
    }
}
@Preview
@Composable
fun PreviewTicket() {
    TicketScreen(navController = NavHostController(LocalContext.current))
}





@Composable
fun CinemaScreen(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(bottom = 16.dp)
            .drawWithContent {
                val gradient = Brush.linearGradient(
                    colors = listOf(Color.Transparent, Black),
                    start = Offset(0f, 0f),
                    end = Offset(0f, size.height)
                )
                drawContent()
                drawRect(brush = gradient)
            }
    )
}


@Composable
fun SeatingsItem(text: String, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(14.dp)
                .clip(shape = CircleShape)
                .background(color)
        )
        Text(
            text = text,
            color = White,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDate(date: DateUiSate, onClick: (DateUiSate) -> Unit) {
    Card(
        modifier = Modifier
            .size(width = 60.dp, height = 70.dp),
        colors = CardDefaults.cardColors(containerColor = White),
        border = BorderStroke(0.2.dp, color = Gray),
        shape = RoundedCornerShape(16.dp),
        onClick = { onClick(date) }

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = date.dayNumber.toString(),
                fontSize = 20.sp,
                color = Black,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = date.day,
                fontSize = 16.sp,
                color = Black,
                fontWeight = FontWeight.Normal
            )
        }

    }
}
@Composable
fun ItemTime(time: String) {
    Card(
        modifier = Modifier.size(width = 60.dp, height = 30.dp),
        colors = CardDefaults.cardColors(containerColor = White),
        border = BorderStroke(0.2.dp, color = Gray),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = time,
                fontSize = 14.sp,
                color = Black,
                fontWeight = FontWeight.Normal,
            )
        }

    }

}