package com.devsoc.icaiefa_2022.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.dataclasses.Speaker

class SpeakersAdapter(val speakers : List<Speaker>) : RecyclerView.Adapter<SpeakersAdapter.SpeakerViewHolder>(){

    inner class SpeakerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpeakerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.speakers, parent, false)
        return SpeakerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SpeakerViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.img_iv_item).setImageResource(speakers[position].img)
            findViewById<TextView>(R.id.name_tv_item).text = speakers[position].name
            findViewById<TextView>(R.id.email_tv_item).text = speakers[position].email
            findViewById<TextView>(R.id.institute_tv_item).text = speakers[position].institute
        }

    }

    override fun getItemCount(): Int {
        return speakers.size
    }
}