package com.example.noteapp.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.preference.PreferenceManager
import com.example.noteapp.R
import com.example.noteapp.negocio.Notas
import kotlinx.android.synthetic.main.activity_lista_notas.*
import kotlinx.android.synthetic.main.cartao_nota.*
import kotlinx.android.synthetic.main.cartao_nota.view.*

class ListaNotasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_notas)

        fab.setOnClickListener {
            val i = Intent(this, NovaNotaActivity::class.java)
            startActivity(i)
        }
    }

    override fun onResume() {
        super.onResume()
        atualizarNotas()
    }

    fun atualizarNotas(){
        container.removeAllViews()

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val cor = prefs.getInt("noteColor", R.color.colorNote)

        for(nota in Notas.listaNotas){
            val card = layoutInflater.inflate(R.layout.cartao_nota, container,false)

            card.txtTitulo.text = nota.titulo
            card.txtDesc.text = nota.desc
            card.txtUser.text = nota.user

            card.setBackgroundColor(cor)

            container.addView(card)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.usuario){
            val i = Intent(this, UsuarioActivity::class.java)
            startActivity(i)
        }else  if(item.itemId == R.id.config){
            val i = Intent(this, ConfigActivity::class.java)
            startActivity(i)
        }

        return super.onOptionsItemSelected(item)
    }
}