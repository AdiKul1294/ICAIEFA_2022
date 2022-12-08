package com.devsoc.icaiefa_2022.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devsoc.icaiefa_2022.MainActivity
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.dataclasses.Driver
import com.google.android.material.imageview.ShapeableImageView
import java.util.*

class DriverAdapter(private val driverList : ArrayList<Driver>): RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.driver_detail_item, parent, false)
        return DriverViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val currentItem = driverList[position]
        holder.driverName.text = currentItem.driver_name
        holder.driverContact.text = currentItem.driver_contact
        holder.callButton.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + currentItem.driver_contact)
            val context=holder.callButton.context
            val intent = Intent( context, MainActivity::class.java)
            context.startActivity(dialIntent)
        }
        holder.iconText.text = currentItem.driver_name.slice(4..4).uppercase()


    }

    override fun getItemCount(): Int {
        return driverList.size
    }


    class DriverViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val driverName: TextView = itemView.findViewById<TextView>(R.id.driver_name)
        val driverContact: TextView = itemView.findViewById<TextView>(R.id.driver_contact)
        val callButton: ImageButton = itemView.findViewById(R.id.call_button)
        val iconText: TextView = itemView.findViewById(R.id.iconText)
    }
}