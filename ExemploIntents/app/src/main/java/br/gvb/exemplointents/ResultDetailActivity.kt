    package br.gvb.exemplointents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_detail.*

class ResultDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_detail)

        btnOp1.setOnClickListener {
            responder("FIFA")
        }

        btnOp2.setOnClickListener {
            responder("GTA")
        }

        btnOp3.setOnClickListener {
            responder("COD")
        }
    }

    fun responder(jogo: String){
        val returnIntent = Intent()

        returnIntent.putExtra("jogo", jogo)
        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }
}