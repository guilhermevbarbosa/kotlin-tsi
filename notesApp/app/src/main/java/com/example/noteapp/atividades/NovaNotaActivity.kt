package com.example.noteapp.atividades

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noteapp.R
import com.example.noteapp.negocio.Nota
import com.example.noteapp.negocio.Notas
import kotlinx.android.synthetic.main.activity_nova_nota.*

class NovaNotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_nota)

        val sharedPrefs = getSharedPreferences("User", Context.MODE_PRIVATE)

        btnAdd.setOnClickListener {
            val username = sharedPrefs.getString("username","")

            username?.let{
                val nota = Nota(titulo = etTitulo.text.toString(), desc = etDesc.text.toString(), user = it)
                Notas.listaNotas.add(nota)
                finish()
            }

        }
    }
}