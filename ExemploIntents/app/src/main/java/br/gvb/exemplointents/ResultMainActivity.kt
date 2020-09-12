package br.gvb.exemplointents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_main.*

class ResultMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_main)

        btnSelecionar.setOnClickListener {
            val i = Intent(this, ResultDetailActivity::class.java)
            startActivityForResult(i, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            val jogo = data?.getStringExtra("jogo")
            txtSelecao.setText(jogo)
        }
    }
}