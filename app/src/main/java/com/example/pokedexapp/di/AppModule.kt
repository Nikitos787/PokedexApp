package com.example.pokedexapp.di

import com.example.pokedexapp.data.remote.PokeApi
import com.example.pokedexapp.repository.PokemonRepository
import com.example.pokedexapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providePokemonRepository(api: PokeApi) = PokemonRepository(api)

    @Provides
    @Singleton
    fun providePokeApi() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PokeApi::class.java)
}