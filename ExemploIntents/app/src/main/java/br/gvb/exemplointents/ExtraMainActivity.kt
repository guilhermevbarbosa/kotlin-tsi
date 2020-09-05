package br.gvb.exemplointents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_extra_main.*

class ExtraMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_main)

        btnEnviarDados.setOnClickListener {
            val i = Intent(this, ExtraDetalheActivity::class.java)

            i.putExtra("nomeCliente", etNome.text.toString())

            startActivity(i)
        }
    }
}