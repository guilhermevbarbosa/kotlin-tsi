package br.gvb.hellokotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_teste.*

class TesteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)

        btnShowMessage.setOnClickListener {
            Toast.makeText(this, "Olá, " + etName.text, Toast.LENGTH_LONG).show()
            alert(this,"Boas vindas", "Olá " + etName.text)
        }
    }

    private fun alert(context: Context, title: String, msg: String) {
        val builder = AlertDialog.Builder(context)

        builder
            .setTitle(title)
            .setMessage(msg)
            .setPositiveButton("Beleza", null)
            .create()
            .show()
    }
}