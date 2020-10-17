package com.example.noteapp.negocio

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Nota(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var titulo: String,
    var desc: String,
    var user: String
)