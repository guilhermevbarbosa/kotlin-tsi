package br.gvb.exemplointents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exp_main.*

class ExpMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp_main)

        btnIrDetalhe.setOnClickListener {
            val i = Intent(this, DetalheActivity::class.java)
            startActivity(i)
        }
    }
}