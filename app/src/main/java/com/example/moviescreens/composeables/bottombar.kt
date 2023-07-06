package com.example.moviescreens.composeables

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun bottombarItem() {
    Scaffold(bottomBar = { bottombar() }) {

    }
}

@Composable
fun bottombar() {
    val screens = listOf(
        bottombarScreen.play,
        bottombarScreen.Search,
        bottombarScreen.Ticket,
        bottombarScreen.Profile,
    )

    NavigationBar(containerColor = Color.White) {
        screens.forEach { Screen ->
            Additem(screen = Screen)
        }
    }
}

@Composable
fun RowScope.Additem(
    screen: bottombarScreen,
) {
    NavigationBarItem(

        icon = {
            if (screen.title == "play")
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color(0xFFFA5524), shape = RoundedCornerShape(50))

                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = screen.icon),
                        contentDescription = null,
                        modifier = Modifier.padding(12.dp)
                    )
                }
            else
                Icon(
                    imageVector = ImageVector.vectorResource(id = screen.icon),
                    contentDescription = null
                )

        },
        onClick = { /*TODO*/ },
        selected = false
    )
}

