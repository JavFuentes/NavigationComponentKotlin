// Paquete que contiene el fragmento PantallaDosFragment
package com.example.navigationcomponentkotlin

// Importaciones necesarias
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

// Define la clase PantallaDosFragment que hereda de la clase Fragment
// y utiliza el archivo de diseño fragment_pantalla_dos.xml
class PantallaDosFragment : Fragment(R.layout.fragment_pantalla_dos) {

    // Método llamado cuando se crea la vista del fragmento
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Encuentra los botones en la vista utilizando sus IDs
        val btnIrUno = requireView().findViewById<Button>(R.id.btnIrPantallaUno)
        val btnIrTres = requireView().findViewById<Button>(R.id.btnIrPantallaTres)

        // Establece el comportamiento de clic para el botón btnIrUno
        btnIrUno.setOnClickListener{
            // Navega al fragmento PantallaUnoFragment
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaUnoFragment)
        }

        // Establece el comportamiento de clic para el botón btnIrTres
        btnIrTres.setOnClickListener{
            // Navega al fragmento PantallaTresFragment
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaTresFragment)
        }
    }
}
