package com.example.moviescreens.screens.tickets

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import com.example.moviescreens.ui.theme.Orange


sealed class SeatState(val seatColor: Color) {
    object Available : SeatState(Color.White)
    object Taken : SeatState(Gray)
    object Selected : SeatState(Orange)

    fun nextState(): SeatState {
        return when (this) {
            Available -> Selected
            Selected -> Taken
            Taken -> Available
        }
    }
}