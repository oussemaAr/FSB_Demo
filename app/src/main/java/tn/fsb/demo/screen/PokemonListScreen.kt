package tn.fsb.demo.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import tn.fsb.demo.composables.PokemonItemCard
import tn.fsb.demo.composables.PokemonItemCardModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonListScreen() {
    Scaffold(
        containerColor = Color(0xFF2B272B),
        topBar = {
            TopAppBar(
                title = { Text("Pokedex") }
            )
        }
    ) { padding ->
        val list = remember {
            mutableStateOf(
                listOf(
                    PokemonItemCardModel(
                        pokemonName = "bulbasaur",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
                        color = 0xFFADC542
                    ),
                    PokemonItemCardModel(
                        pokemonName = "ivysaur",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png",
                        color = 0xFFADC542

                    ),
                    PokemonItemCardModel(
                        pokemonName = "venusaur",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png",
                        color = 0xFFADC542

                    ),
                    PokemonItemCardModel(
                        pokemonName = "charmander",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png",
                        color = 0xFFADC542

                    ),
                    PokemonItemCardModel(
                        pokemonName = "charmeleon",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png",
                        color = 0xFFADC542

                    ),
                    PokemonItemCardModel(
                        pokemonName = "charizard",
                        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png",
                        color = 0xFFFDC554
                    )
                )
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(padding)
        ) {
            itemsIndexed(list.value) { i, item ->
                PokemonItemCard(
                    pokemon = item,
                    onClick = {
                        list.value = list.value.mapIndexed { index, item ->
                            if (i == index) item.copy(
                                isBlur = !item.isBlur
                            ) else item
                        }
                    }
                )
            }
        }
    }
}

private const val TAG = "PokemonListScreen"

val pokemonList = listOf(
    PokemonItemCardModel(
        pokemonName = "bulbasaur",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png",
        color = 0xFFADC542

    ),
    PokemonItemCardModel(
        pokemonName = "ivysaur",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png",
        color = 0xFFADC542

    ),
    PokemonItemCardModel(
        pokemonName = "venusaur",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png",
        color = 0xFFADC542

    ),
    PokemonItemCardModel(
        pokemonName = "charmander",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png",
        color = 0xFFADC542

    ),
    PokemonItemCardModel(
        pokemonName = "charmeleon",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png",
        color = 0xFFADC542

    ),
    PokemonItemCardModel(
        pokemonName = "charizard",
        pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png",
        color = 0xFFFDC554
    )
)
