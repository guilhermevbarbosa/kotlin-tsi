package br.gvb.aula3


import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date.*
import java.util.*

class DateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val calendario = Calendar.getInstance()
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        etData.setOnClickListener {
            val pegarData = DatePickerDialog(this, { view, anoQueSeraSelecionado, mesQueSeraSelecionado, diaQueSeraSelecionada ->
                etData.setText("$diaQueSeraSelecionada/$mesQueSeraSelecionado/$anoQueSeraSelecionado")
            }, ano, mes, dia)

            pegarData.show()
        }
    }
}