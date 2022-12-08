package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.adapters.AboutListAdapter
import com.devsoc.icaiefa_2022.databinding.FragmentAboutConferenceBinding

class AboutConferenceFragment : Fragment() {
    private lateinit var binding : FragmentAboutConferenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about_conference, container, false)

//        val webView = binding.infoWvAcf
//        webView.settings.javaScriptEnabled = true
//        webView.loadUrl("https://www.bits-goa.ac.in/ICAIEFA2022/about.html")

        var expandableListView = binding.expandableListView
        if (expandableListView != null) {
            val listData = data
            var titleList = ArrayList(listData.keys)
            var adapter = AboutListAdapter(requireContext(), titleList as ArrayList<String>,
                listData
            )
            expandableListView!!.setAdapter(adapter)
        }

        return binding.root
    }
    val data: kotlin.collections.LinkedHashMap<String, List<String>>
        get() {
            val listData = LinkedHashMap<String, List<String>>()

            val aboutTheUniversity = ArrayList<String>()
            aboutTheUniversity.add(getString(R.string.about_uni))


            val phyLocation = ArrayList<String>()
            phyLocation.add(getString(R.string.physical_location))

            val aboutTheDept = ArrayList<String>()
            aboutTheDept.add(getString(R.string.about_the_dept))

            val aboutTheVenue = ArrayList<String>()
            aboutTheVenue.add(getString(R.string.about_the_venue))

            val howToReach = ArrayList<String>()
            howToReach.add(getString(R.string.how_to_reach))

            val aboutThePlace = ArrayList<String>()
            aboutThePlace.add(getString(R.string.about_the_place))

            val sightSeeing = ArrayList<String>()
            sightSeeing.add(getString(R.string.sightseeing))






            // set multiple list to header title position
            listData["About the University"] = aboutTheUniversity
            listData["The Physical Location: K K Birla Goa Campus"] = phyLocation
            listData["About the Department"] = aboutTheDept
            listData["About the Venue"] = aboutTheVenue
            listData["How to Reach the Venue"] = howToReach
            listData["About the Place"] = aboutThePlace
            listData["Half-day/Full-day Sight Seeing from BITS"] = sightSeeing


            return listData
        }

}