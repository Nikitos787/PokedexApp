package com.example.pokedexapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "pokemon_list_screen") {
        composable("pokemon_list_screen") {

        }
        composable("pokemon_detail_screen/{dominantColor}/{pokemonName}", arguments = listOf(
            navArgument("dominantColor") {
                type = NavType.IntType
            },
            navArgument("pokemonName") {
                type = NavType.StringType
            }
        )
        ) {
            val dominantColor = remember {
                val color = it.arguments?.getInt("dominantColor")
                color?.let { Color(it) } ?: Color.White
            }
            val pokemonName = remember {
                it.arguments?.getString("pokemonName")
            }
        }
    }
}
