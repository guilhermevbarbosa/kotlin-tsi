package br.gvb.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tel.*

class TelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tel)

        val itens = arrayOf("Selecione", "Celular", "Comercial", "Residencial", "Outro")

        // recursos padrões do android = android.R
        // recursos feitos por nós = R.layout

        // add layout de quando o spinner (combo) está aberta
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)

        // add layout de quando está fechado o spinner (combo)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spTipoTel.adapter = adapter

        btnConcluir.setOnClickListener {
            if( !etNome.text.isEmpty() && !etTel.text.isEmpty() && spTipoTel.selectedItemPosition != 0 ) {

                val msg = """Nome: ${etNome.text}
                * Telefone: ${etTel.text}
                * Tipo de Telefone: ${spTipoTel.selectedItem}     
                """.trimMargin("*")

                alert("Concluído", msg, this)
            }
            else
            {
                alert("Erro", "Todos os campos são obrigatórios!", this)
            }
        }
    }
}