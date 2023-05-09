package br.senai.sp.jandira.rickandmorty.model

import android.webkit.WebStorage.Origin

data class Character(
    val id : Long,
    val name : String,
    val status : String,
    val species : String,
    val image : String,
    val location : Location,
    val origin : br.senai.sp.jandira.rickandmorty.model.Origin
)
