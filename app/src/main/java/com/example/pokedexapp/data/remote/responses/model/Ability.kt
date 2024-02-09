package com.example.pokedexapp.data.remote.responses.model

data class Ability(
    val ability: com.example.pokedexapp.data.remote.responses.model.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)