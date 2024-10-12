package com.example.parcialdampuruguay20100770.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdampuruguay20100770.R
import com.example.parcialdampuruguay20100770.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var btnCalcular: Button
    private lateinit var editTextVuelo: EditText
    private lateinit var editTextAlojamiento: EditText
    private lateinit var editTextNoches: EditText
    private lateinit var editTextComida: EditText
    private lateinit var textViewResultado: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializar las vistas
        btnCalcular = view.findViewById(R.id.btnCalcular)
        editTextVuelo = view.findViewById(R.id.editTextCostVuelo)
        editTextAlojamiento = view.findViewById(R.id.editTextCostAloja)
        editTextNoches = view.findViewById(R.id.editTextCantNoc)
        editTextComida = view.findViewById(R.id.editTextCostComid)
        textViewResultado = view.findViewById(R.id.textViewResultado)

        // Configurar el listener del botón
        btnCalcular.setOnClickListener {

            // Obtener valores de los campos de texto
            val csVuelo = editTextVuelo.text.toString().toDoubleOrNull()
            val csAlojamiento = editTextAlojamiento.text.toString().toDoubleOrNull()
            val csNoches = editTextNoches.text.toString().toDoubleOrNull()
            val csComida = editTextComida.text.toString().toDoubleOrNull()

            // Verificar que los valores sean válidos
            if (csVuelo != null && csAlojamiento != null && csNoches != null && csComida != null && csVuelo > 0) {
                // Calcular el rendimiento
                val presupuesto = csVuelo + (csAlojamiento * csNoches) + (csComida * csNoches)
                textViewResultado.text = "$presupuesto"
            } else {
                // Mostrar un mensaje de error si los valores son inválidos
                Toast.makeText(context, "Ingrese valores válidos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}