package com.example.moviescreens.composeables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviescreens.R


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




@Composable
fun TopChips(
    text: String,
    isSelected: Boolean = false,
    onSelectedChipChanged: Boolean.() -> Unit,
) {
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        shadowElevation = 0.dp,
        shape = MaterialTheme.shapes.extraLarge,
        color = if (isSelected) Transparent else Color(0xFFFA1616),
        border = if (isSelected) BorderStroke(width = 1.dp, color = LightGray) else BorderStroke(width = 0.dp, color = Transparent)
    ) {
        Row(
            modifier = Modifier
                .toggleable(
                    value = isSelected,
                    onValueChange = {
                        onSelectedChipChanged(isSelected)
                    }
                )
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}
