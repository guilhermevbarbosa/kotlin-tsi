package br.gvb.exemplofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frag_dinam.*

class FragDinamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag_dinam)

        btnFrag1.setOnClickListener {
            val frag1 = FragmentoTeste()

            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag1).commit()
        }

        btnFrag2.setOnClickListener {
            val frag2 = FragmentoTeste02()

            supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag2).commit()
        }
    }
}