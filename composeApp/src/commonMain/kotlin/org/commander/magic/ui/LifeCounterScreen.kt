package org.commander.magic.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.commander.magic.viewmodel.GameViewModel

@Composable
fun LifeCounterScreen(viewModel: GameViewModel) {
    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        viewModel.lifeTotal.forEachIndexed({ index, value ->
            LifeCounterBlock(
                player = index,
                life = value,
                updateLife = { player, life -> viewModel.updateLifeTotal(player, life) }
            )
        })
    }
}