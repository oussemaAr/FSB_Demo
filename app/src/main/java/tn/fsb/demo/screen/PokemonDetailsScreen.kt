package tn.fsb.demo.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonDetailsScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Pokemon Details")
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier.padding(padding)
        ) {
            PokemonDetailsHeader()
            PokemonDetailsContent()
        }
    }
}

@Composable
fun PokemonDetailsHeader(){}

@Composable
fun PokemonDetailsContent(){}