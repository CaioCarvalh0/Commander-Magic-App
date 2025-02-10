package org.commander.magic.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LifeCounterBlock(
    player: Int,
    life: Int,
    updateLife: (Int, Int) -> Unit) {

    Row (
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Player ${player + 1}")
        Button(onClick = { updateLife(player, life + 1) }) {
            Text("+")
        }
        Text("Life: $life")
        Button(onClick = { updateLife(player, life - 1) }) {
            Text("-")
        }
    }
}