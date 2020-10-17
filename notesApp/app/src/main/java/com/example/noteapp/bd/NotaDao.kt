package com.example.noteapp.bd

import androidx.room.Dao
import com.example.noteapp.negocio.Nota
@Insert
@Dao
interface NotaDao {

    fun inserir(nota: Nota)

    fun listarTodos(): List<Nota>
}