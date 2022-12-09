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

class MapsFragment : Fragment() {
    lateinit var myGoogleMap: GoogleMap
    private val callback = OnMapReadyCallback {
        with(it.uiSettings) {
            isZoomControlsEnabled = true
            isCompassEnabled = true
            isScrollGesturesEnabled = true
        }
        myGoogleMap = it
        onMapReady(it, LatLng(15.390725144730112, 73.87846601024137), "BITS Goa")
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

    private fun onMapReady(googleMap: GoogleMap, location: LatLng, markerTitle: String) {
        val markerLocation = location
        val marker = googleMap.addMarker(
            MarkerOptions()
                .position(markerLocation)
                .title(markerTitle)
        )
        googleMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(
                location, 18f
            )
        )
        marker?.showInfoWindow()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btn1: Button = view.findViewById(R.id.dMessBtn)
        var btn2: Button = view.findViewById(R.id.dlt10Btn)
        var btn3: Button = view.findViewById(R.id.VGHBtn)
        var btn4: Button = view.findViewById(R.id.medCBtn)
        var btn5: Button = view.findViewById(R.id.bDomeBtn)

        btn1.setOnClickListener{
            onMapReady(myGoogleMap, LatLng(15.393059810098007, 73.88400429732732), "D Mess"
            )
        }
        btn2.setOnClickListener{
            onMapReady(myGoogleMap, LatLng(15.392091481206723, 73.88179633166733), "DLT-10"
            )
        }
        btn3.setOnClickListener{
            onMapReady(myGoogleMap, LatLng(15.388409935353897, 73.87679557050468), "BITS Visitor's Guest House"
            )
        }
        btn4.setOnClickListener{
            onMapReady(myGoogleMap, LatLng(15.391634129693461, 73.87607826751572), "Medical Center, BITS Goa"
            )
        }
        btn5.setOnClickListener{
            onMapReady(myGoogleMap, LatLng(15.39288608655224, 73.88038973487325), "B Dome, BITS Goa Main Building"
            )
        }
        val mapFragment =
            childFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)


    }


//    private fun addMarkers(googleMap: GoogleMap) {
//    }

}