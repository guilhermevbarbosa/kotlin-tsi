package br.gvb.exemplofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragmento_teste.*
import kotlinx.android.synthetic.main.fragmento_teste.view.*

class FragmentoTeste : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmento_teste, container, false)

        view.btnMostrarMsg.setOnClickListener {
            Toast.makeText(activity, "Olá, ${etNome.text}",Toast.LENGTH_LONG).show()
        }

        return view
    }
}