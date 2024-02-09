package com.example.pokedexapp.data.remote.responses.model

data class Sprites(
    val back_default: String,
    val back_female: Any,
    val back_shiny: String,
    val back_shiny_female: Any,
    val front_default: String,
    val front_female: Any,
    val front_shiny: String,
    val front_shiny_female: Any,
    val other: com.example.pokedexapp.data.remote.responses.model.Other,
    val versions: com.example.pokedexapp.data.remote.responses.model.Versions
)