package com.example.pokedexapp.data.remote.responses.model

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokedexapp.data.remote.responses.model.StatX
)