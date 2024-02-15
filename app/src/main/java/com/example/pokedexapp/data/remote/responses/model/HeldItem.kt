package com.example.pokedexapp.data.remote.responses.model

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)