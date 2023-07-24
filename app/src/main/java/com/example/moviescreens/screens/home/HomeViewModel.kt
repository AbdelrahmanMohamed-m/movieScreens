package com.example.moviescreens.screens.home

import androidx.lifecycle.ViewModel
import com.example.moviescreens.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getMovieImages()
    }

    private fun getMovieImages() {
        _state.update {
            it.copy(
                movieImages = listOf(
                    R.drawable.mage,
                    R.drawable.beat,
                    R.drawable.person2,
                )
            )
        }
    }
}