package com.example.parcialdampuruguay20100770.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdampuruguay20100770.R
import com.example.parcialdampuruguay20100770.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var listViewEquipos: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializar el ListView
        listViewEquipos = view.findViewById(R.id.listViewEquipos)

        // Crear un arreglo estático de equipos de fútbol
        val equipos = listOf("GlobeGuard Insurance", "SafeJourney Coverage", "TravelShield Protection", "VoyageSecure", "WanderSure Travel Insurance")

        // Crear un adaptador para mostrar los equipos en el ListView
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, equipos)

        // Asignar el adaptador al ListView
        listViewEquipos.adapter = adapter
    }
}