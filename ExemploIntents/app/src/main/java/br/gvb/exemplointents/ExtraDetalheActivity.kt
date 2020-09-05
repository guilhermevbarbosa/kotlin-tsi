package br.gvb.exemplointents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_extra_main.*

class ExtraDetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_main)

        val nome = intent.getStringExtra("nomeCliente")
        etNome.setText(nome + " da main")
    }
}