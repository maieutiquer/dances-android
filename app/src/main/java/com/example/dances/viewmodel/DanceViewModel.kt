package com.example.dances.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.mutableStateListOf
import com.example.dances.model.Dance
import com.example.dances.network.RetrofitInstance
import kotlinx.coroutines.launch


class DanceViewModel : ViewModel() {
    private val _dances = mutableStateListOf<Dance>()
    val dances: List<Dance> = _dances

    init {
        viewModelScope.launch {
            val danceList = RetrofitInstance.api.getDances()
            _dances.addAll(danceList)
        }
    }
}
