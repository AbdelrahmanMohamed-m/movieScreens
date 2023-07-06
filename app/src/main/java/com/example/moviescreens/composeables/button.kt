package com.example.moviescreens.composeables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviescreens.R

@Composable
 fun ButtonUnselected() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        modifier = Modifier
            .padding(bottom = 16.dp)
            .border(
                width = 1.dp,
                color = Color.DarkGray,
                shape = CircleShape
            )
    ) {
        Text(text = "Now Showing", color = Color.White)
    }
}


@Composable
fun ButtonSelected() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF4500)
        ),
        modifier = Modifier
            .padding(bottom = 16.dp)
    ) {
        Text(text = "Now Showing", color = Color.White)
    }
}



@Composable
fun GenreButton() {
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
                text = stringResource(R.string.action),
                color = Color.Black,
                fontSize = 14.sp,
            )
        }
    }
}


