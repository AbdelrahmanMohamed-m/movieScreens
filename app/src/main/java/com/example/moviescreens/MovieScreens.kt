package com.example.moviescreens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviescreens.screens.MovieDetailsScreen
import com.example.moviescreens.screens.home.HomeScreen
import com.example.moviescreens.screens.tickets.TicketScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MovieScreens() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeScreen") {
        composable("TicketScreen") { TicketScreen(navController) }
        composable("HomeScreen") { HomeScreen(navController) }
          composable("MovieDetailsScreen") { MovieDetailsScreen(navController) }
    }
}
