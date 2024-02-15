package com.example.pokedexapp.data.remote.responses.model

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val black_white: BlackWhite
)