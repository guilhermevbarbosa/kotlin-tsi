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

        val calendar = Calendar.getInstance()
        val ano = calendar.get(Calendar.YEAR)
        val mes = calendar.get(Calendar.MONTH)
        val dia = calendar.get(Calendar.DAY_OF_MONTH)

        etData.setOnClickListener {
            val datePicker = DatePickerDialog(this, { view, year, month, day ->
                etData.setText("$day/$month/$year")
            }, ano, mes, dia)

            datePicker.show()
        }
    }
}