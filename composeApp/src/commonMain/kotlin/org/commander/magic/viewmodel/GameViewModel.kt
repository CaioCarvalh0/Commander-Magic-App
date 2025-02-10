package org.commander.magic.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private val _lifeTotal = mutableStateListOf(40, 40, 40, 40)
    val lifeTotal = _lifeTotal

    fun updateLifeTotal(player: Int, life: Int) {
        _lifeTotal[player] = life
    }
}