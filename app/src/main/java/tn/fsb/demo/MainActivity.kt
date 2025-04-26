package tn.fsb.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import tn.fsb.demo.screen.PokemonListScreen
import tn.fsb.demo.ui.theme.FSBDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FSBDemoTheme {
                PokemonListScreen()
            }
        }
    }
}

