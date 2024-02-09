package com.example.pokedexapp.data.remote.responses.model

data class Move(
    val move: com.example.pokedexapp.data.remote.responses.model.MoveX,
    val version_group_details: List<com.example.pokedexapp.data.remote.responses.model.VersionGroupDetail>
)