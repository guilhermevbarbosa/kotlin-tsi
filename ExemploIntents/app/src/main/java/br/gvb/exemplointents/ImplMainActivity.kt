package br.gvb.exemplointents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_impl_main.*

class ImplMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_impl_main)

        btnIrDetalhe.setOnClickListener {
            val i = Intent("br.gvb.exemplointents.DETALHE")
            startActivity(i)
        }
    }
}