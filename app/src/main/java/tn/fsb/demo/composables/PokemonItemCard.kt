package tn.fsb.demo.composables

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import tn.fsb.demo.R
import tn.fsb.demo.ui.theme.FSBDemoTheme

data class PokemonItemCardModel(
    val pokemonName: String,
    val pokemonImage: String,
    val color: Long,
    var isBlur: Boolean = true
)

private const val TAG = "PokemonItemCard"

@Composable
fun PokemonItemCard(
    pokemon: PokemonItemCardModel,
    onClick : () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .blur(if (pokemon.isBlur) 16.dp else 0.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color(pokemon.color))
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = pokemon.pokemonImage,
                contentDescription = null,
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
            )

            Text(
                text = pokemon.pokemonName,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(
                        16.dp
                    )
            )
        }
    }
}

@Preview
@Composable
fun PokemonItemCardPreview() {
    FSBDemoTheme {
        PokemonItemCard(
            PokemonItemCardModel(
                pokemonName = "Pikachu",
                pokemonImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png",
                color = 0xFFEEFFFF,
            )
        ){}
    }
}