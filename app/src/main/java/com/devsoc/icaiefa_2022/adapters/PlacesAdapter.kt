package com.devsoc.icaiefa_2022.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.dataclasses.Place
import com.devsoc.icaiefa_2022.dataclasses.Speaker

class PlacesAdapter(val places : List<Place>):  RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>(){

    var onItemClick : ((Place) -> Unit)? = null

    inner class PlaceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.places, parent, false)
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.image_iv).setImageResource(places[position].img)
            findViewById<TextView>(R.id.name_tv).text = places[position].name
        }

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(places[position])
        }

    }

    override fun getItemCount(): Int {
        return places.size
    }
}