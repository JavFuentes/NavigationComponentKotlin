package com.example.navigationcomponentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PantallaTresFragment : Fragment(R.layout.fragment_pantalla_tres) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIrUno = requireView().findViewById<Button>(R.id.btnIrPantallaUno)
        val btnIrDos = requireView().findViewById<Button>(R.id.btnIrPantallaDos)

        btnIrUno.setOnClickListener{
            findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaUnoFragment)
        }

        btnIrDos.setOnClickListener{
            findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaDosFragment)
        }
    }
}