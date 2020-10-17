package com.example.noteapp.atividades

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noteapp.R
import kotlinx.android.synthetic.main.activity_usuario.*

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val sharedPref = getSharedPreferences("User", Context.MODE_PRIVATE)
        etUsuario.setText(sharedPref.getString("username", ""))

        btnSalvar.setOnClickListener {
            val editor = sharedPref.edit()

            editor.putString("username", etUsuario.text.toString())
            editor.commit()
        }
    }
}