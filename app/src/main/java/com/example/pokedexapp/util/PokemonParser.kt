package com.example.pokedexapp.util

import androidx.compose.ui.graphics.Color
import com.example.pokedexapp.data.remote.responses.model.Stat
import com.example.pokedexapp.data.remote.responses.model.Type
import com.example.pokedexapp.ui.theme.AtkColor
import com.example.pokedexapp.ui.theme.DefColor
import com.example.pokedexapp.ui.theme.HPColor
import com.example.pokedexapp.ui.theme.SpAtkColor
import com.example.pokedexapp.ui.theme.SpDefColor
import com.example.pokedexapp.ui.theme.SpdColor
import com.example.pokedexapp.ui.theme.TypeBug
import com.example.pokedexapp.ui.theme.TypeDark
import com.example.pokedexapp.ui.theme.TypeDragon
import com.example.pokedexapp.ui.theme.TypeElectric
import com.example.pokedexapp.ui.theme.TypeFairy
import com.example.pokedexapp.ui.theme.TypeFighting
import com.example.pokedexapp.ui.theme.TypeFire
import com.example.pokedexapp.ui.theme.TypeFlying
import com.example.pokedexapp.ui.theme.TypeGhost
import com.example.pokedexapp.ui.theme.TypeGrass
import com.example.pokedexapp.ui.theme.TypeGround
import com.example.pokedexapp.ui.theme.TypeIce
import com.example.pokedexapp.ui.theme.TypeNormal
import com.example.pokedexapp.ui.theme.TypePoison
import com.example.pokedexapp.ui.theme.TypePsychic
import com.example.pokedexapp.ui.theme.TypeRock
import com.example.pokedexapp.ui.theme.TypeSteel
import com.example.pokedexapp.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}