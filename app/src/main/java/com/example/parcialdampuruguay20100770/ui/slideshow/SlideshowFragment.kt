package com.example.parcialdampuruguay20100770.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialdampuruguay20100770.Hotel
import com.example.parcialdampuruguay20100770.HotelAdapter
import com.example.parcialdampuruguay20100770.R
import com.example.parcialdampuruguay20100770.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerviewHoteles)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val hoteles = listOf(
            Hotel("Hotel Dubai", "3 de 5 estrellas", "Av. Siempreviva 742", 45,R.drawable.ic_menu_camera,),
            Hotel("Hotel Paraiso", "3 de 5 estrellas", "Av. Siempreviva 742", 45,R.drawable.ic_menu_gallery),
            Hotel("Hostal ESAN", "3 de 5 estrellas", "Av. Siempreviva 742", 45, R.drawable.ic_menu_slideshow)
        )

        recyclerView.adapter = HotelAdapter(hoteles)

        return view
    }
}