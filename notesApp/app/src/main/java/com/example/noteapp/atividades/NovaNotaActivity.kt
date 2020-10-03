package com.example.noteapp.atividades

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

        btnAdd.setOnClickListener {
            val nota = Nota(etTitulo.text.toString(), etDesc.text.toString())
            Notas.listaNotas.add(nota)
            finish()
        }
    }
}