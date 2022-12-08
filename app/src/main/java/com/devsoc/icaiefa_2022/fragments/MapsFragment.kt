package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.devsoc.icaiefa_2022.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment(), OnMapReadyCallback {
    private val callback = OnMapReadyCallback { googleMap ->
        with(googleMap.uiSettings) {
            isZoomControlsEnabled = true
            isCompassEnabled = true
            isScrollGesturesEnabled = true
        }
        val markers: List<MarkerOptions> = listOf(

            MarkerOptions().position(LatLng(15.393059810098007, 73.88400429732732)).title("D Mess"),
            MarkerOptions().position(LatLng(15.388409935353897, 73.87679557050468))
                .title("BITS Visitor's Guest House"),
            MarkerOptions().position(LatLng(15.391634129693461, 73.87607826751572))
                .title("Medical Center, BITS Goa"),
            MarkerOptions().position(LatLng(15.392091481206723, 73.88179633166733)).title("DLT-10"),
            MarkerOptions().position(LatLng(15.390725144730112, 73.87846601024137))
                .title("BITS Goa").snippet("Welcome to BITS Goa!"),
        )

        markers.forEach {
            val marker = googleMap.addMarker(it)
            marker?.showInfoWindow()
        }

        googleMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(
                    15.390725144730112,
                    73.87846601024137
                ), 15.5f
            )
        )


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onMapReady(googleMap: GoogleMap) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

    }

//    private fun addMarkers(googleMap: GoogleMap) {
//    }

}