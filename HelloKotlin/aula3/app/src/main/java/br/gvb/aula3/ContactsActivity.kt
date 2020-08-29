package br.gvb.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacts.*

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        btnConcluir.setOnClickListener {
            var msg = """Nome: ${etNome.text}
                |Telefone: ${etTel.text}
                |Email: ${etEmail.text}
                |
                |Preferência de contato
            """.trimMargin("|")

            if(cbPrefTel.isChecked){
                msg += "\n - Telefone"
            }

            if(cbPrefEmail.isChecked){
                msg += "\n - Email"
            }

            alert("Resultado", msg, this)
        }
    }
}