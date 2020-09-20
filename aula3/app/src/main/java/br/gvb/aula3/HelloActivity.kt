package br.gvb.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        btnHello.setOnClickListener {
            var pronoum = "";

            when (rgPronoums.checkedRadioButtonId){
                R.id.rbShe -> pronoum = getString(R.string.she)
                R.id.rbHe -> pronoum = getString(R.string.he)
                R.id.rbNI -> pronoum = getString(R.string.neutral)
            }

            val mensagem = getString(R.string.hello) + etName.text + "! " + getString(R.string.choice) + pronoum
            alert(getString(R.string.finished), mensagem, this)
        }
    }
}