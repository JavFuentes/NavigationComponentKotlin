// Paquete que contiene el fragmento PantallaUnoFragment
package com.example.navigationcomponentkotlin

// Importaciones necesarias
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

// Define la clase PantallaUnoFragment que hereda de la clase Fragment
// y utiliza el archivo de diseño fragment_pantalla_uno.xml
class PantallaUnoFragment : Fragment(R.layout.fragment_pantalla_uno) {

    // Método llamado cuando se crea la vista del fragmento
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Encuentra los botones en la vista utilizando sus IDs
        val btnIrDos = requireView().findViewById<Button>(R.id.btnIrPantallaDos)
        val btnIrTres = requireView().findViewById<Button>(R.id.btnIrPantallaTres)

        // Establece el comportamiento de clic para el botón btnIrDos
        btnIrDos.setOnClickListener{
            // Navega al fragmento PantallaDosFragment
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaDosFragment)
        }

        // Establece el comportamiento de clic para el botón btnIrTres
        btnIrTres.setOnClickListener{
            // Navega al fragmento PantallaTresFragment
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaTresFragment)
        }
    }
}
