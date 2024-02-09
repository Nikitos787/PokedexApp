package com.example.pokedexapp.repository

import com.example.pokedexapp.data.remote.PokeApi
import com.example.pokedexapp.data.remote.responses.list.PokemonList
import com.example.pokedexapp.data.remote.responses.model.Pokemon
import com.example.pokedexapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(private val api: PokeApi) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error(message = "Error is appeared")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemon(pokemonName)
        } catch (e: Exception) {
            return Resource.Error(message = "Error is appeared")
        }
        return Resource.Success(response)
    }
}
