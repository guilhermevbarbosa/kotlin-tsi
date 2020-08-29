package br.gvb.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select.*

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        btnSend.setOnClickListener {
            var gender = "";

            when(rgPronouns.checkedRadioButtonId){
                R.id.rbShe -> gender = getString(R.string.feminino)
                R.id.rbHe -> gender = getString(R.string.masculino)
                R.id.rbNa -> gender = getString(R.string.nao_informar_valor)
            }

            val msg = etName.text.toString() + " " + getString(R.string.escolha) + " " + gender

            alert(getString(R.string.enviado), msg, this)
        }
    }
}