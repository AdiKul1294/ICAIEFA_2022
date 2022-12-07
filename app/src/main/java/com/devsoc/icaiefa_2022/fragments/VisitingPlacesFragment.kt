package com.devsoc.icaiefa_2022.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.adapters.PlacesAdapter
import com.devsoc.icaiefa_2022.databinding.FragmentVisitingPlacesBinding
import com.devsoc.icaiefa_2022.dataclasses.Place

class VisitingPlacesFragment : Fragment() {

    private lateinit var binding : FragmentVisitingPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_visiting_places, container, false)

        var placesList = mutableListOf<Place>(
            Place(
                "Bogmalo Beach",
                R.mipmap.bogmalo,
                "https://maps.app.goo.gl/N7a73BLJ5x5wmbQ56"
            ),
            Place(
                "Bogmalo Beach",
                R.mipmap.bogmalo,
                "https://maps.app.goo.gl/N7a73BLJ5x5wmbQ56"
            ),
            Place(
                "Bogmalo Beach",
                R.mipmap.bogmalo,
                "https://maps.app.goo.gl/N7a73BLJ5x5wmbQ56"
            ),
            Place(
                "Bogmalo Beach",
                R.mipmap.bogmalo,
                "https://maps.app.goo.gl/N7a73BLJ5x5wmbQ56"
            )
        )

        val adapter = PlacesAdapter(placesList)
        binding.otherRvVpf.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        adapter.onItemClick = {
            val url : String = it.url
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse(url))
        }

        return binding.root
    }

}