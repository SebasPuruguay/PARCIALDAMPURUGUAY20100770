package com.example.parcialdampuruguay20100770

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HotelAdapter(private val hoteles: List<Hotel>) : RecyclerView.Adapter<HotelAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre: TextView = view.findViewById(R.id.nombreHotel)
        val calificacion: TextView = view.findViewById(R.id.calificacion)
        val direccion: TextView = view.findViewById(R.id.direccion)
        val costo: TextView = view.findViewById(R.id.costo)
        val imagen: ImageView = view.findViewById(R.id.imagenHotel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hotel, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hotel = hoteles[position]
        holder.nombre.text = hotel.nombre
        holder.calificacion.text = hotel.calificacion
        holder.direccion.text = hotel.direccion
        holder.costo.text = hotel.costo.toString()
        holder.imagen.setImageResource(hotel.imagen)
    }

    override fun getItemCount() = hoteles.size

}