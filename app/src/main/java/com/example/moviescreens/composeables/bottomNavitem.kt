package com.example.moviescreens.composeables

import com.example.moviescreens.R


sealed class bottombarScreen(
    val title:String,
    val icon:Int
){
    object play:bottombarScreen("play", R.drawable.clapperboard_play1)
    object Search:bottombarScreen("Search", R.drawable.searchnormal1)
    object Profile:bottombarScreen("Profile", R.drawable.eva_person_outline)
    object Ticket:bottombarScreen("ticket", R.drawable.ticket)
}