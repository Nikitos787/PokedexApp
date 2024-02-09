package com.example.pokedexapp.data.remote.responses.model

data class Pokemon(
    val abilities: List<com.example.pokedexapp.data.remote.responses.model.Ability>,
    val base_experience: Int,
    val cries: com.example.pokedexapp.data.remote.responses.model.Cries,
    val forms: List<com.example.pokedexapp.data.remote.responses.model.Form>,
    val game_indices: List<com.example.pokedexapp.data.remote.responses.model.GameIndice>,
    val height: Int,
    val held_items: List<com.example.pokedexapp.data.remote.responses.model.HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokedexapp.data.remote.responses.model.Move>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<Any>,
    val species: com.example.pokedexapp.data.remote.responses.model.Species,
    val sprites: com.example.pokedexapp.data.remote.responses.model.Sprites,
    val stats: List<com.example.pokedexapp.data.remote.responses.model.Stat>,
    val types: List<com.example.pokedexapp.data.remote.responses.model.Type>,
    val weight: Int
)