package com.example.pokedexapp.data.remote.responses.model

data class HeldItem(
    val item: com.example.pokedexapp.data.remote.responses.model.Item,
    val version_details: List<com.example.pokedexapp.data.remote.responses.model.VersionDetail>
)