package com.example.pokedexapp.data.remote

import com.example.pokedexapp.data.remote.responses.list.PokemonList
import com.example.pokedexapp.data.remote.responses.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{pokemonName}")
    suspend fun getPokemon(
        @Path("pokemonName") pokemonName: String
    ): Pokemon
}