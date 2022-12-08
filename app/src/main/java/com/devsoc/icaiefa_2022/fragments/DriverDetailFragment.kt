package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.adapters.DriverAdapter
import com.devsoc.icaiefa_2022.dataclasses.Driver

class DriverDetailFragment : Fragment() {

    private lateinit var adapter: DriverAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var driverArrayList: ArrayList<Driver>

    lateinit var driverNames: Array<String>
    lateinit var driverContacts: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_driver_detail, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.driver_rv_sf)
        recyclerView.layoutManager = layoutManager
        recyclerView.hasFixedSize()
        adapter = DriverAdapter(driverArrayList)
        recyclerView.adapter = adapter

    }

    private fun dataInitialize(){
        driverArrayList = arrayListOf<Driver>()

        driverNames = arrayOf(
            "Mr. Santosh",
            "Mr. Parshuram Dodamani",
            "Mr. Namdev",
            "Mr. Kalidas Naik",
            "Mr. Satyawan Chari",
            "Mr. Umakant Naik",
            "Mr. Ramesh Naik",
            "Mr. Arjun Sandimani",
            "Mr. Naneshwar Gawas",
            "Mr. Arjun Desai",
            "Mr. Sakim Sayyed",
            "Mr. Deenu Lamani",
            "Mr. Vithal",
            "Mr. Neelesh",
            "Mr. Ravi Chalwadi",
            "Mr. Frankline Mascarenhas",
            "Mr. Ravi Rathod",
            "Mr. Subhash",
            "Mr. Mustaq Ali",
            "Mr. Santosh Naik"
        )
        driverContacts = arrayOf(
            "+91 9960361099",
            "+91 9527992906",
            "+91 9765173790",
            "+91 9890211087",
            "+91 9637232546",
            "+91 9890362468",
            "+91 9890695214",
            "+91 9766374390",
            "+91 7350924968",
            "+91 9890277334",
            "+91 9923271173",
            "+91 9923119685",
            "+91 9765376326",
            "+91 9765081213",
            "+91 9011333118",
            "+91 8880232627",
            "+91 7757953037",
            "+91 8625999381",
            "+91 9923220528",
            "+91 9823100971"
        )
        for (i in driverNames.indices){
            val driver = Driver(driverNames[i], driverContacts[i])
            driverArrayList.add(driver)
        }
    }
}