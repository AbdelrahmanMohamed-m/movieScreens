package com.example.moviescreens.screens.home

data class HomeUiState(
    val movieName: String = "",
    val movieImages: List<Int> = emptyList(),
)