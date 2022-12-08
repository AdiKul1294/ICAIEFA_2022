package com.devsoc.icaiefa_2022.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.browser.customtabs.CustomTabsIntent
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentRestaurantsBinding

class RestaurantsFragment : Fragment() {
    private lateinit var binding : FragmentRestaurantsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_restaurants, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.link1CvRf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.justdial.com/Goa/Peppers-Gourmet-Cuisine-Near-Child-Care-School-Margao/0832P832STD51443_BZDET?xid=R29hIFJlc3RhdXJhbnRzIFp1YXJpbmFnYXI="))
        }

        binding.link2CvRf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.justdial.com/Goa/Foodys-Fast-Food-Next-to-Iob-Bank-MES-Junction-Zuarinagar/0832PX832-X832-160917160754-G6V9_BZDET?xid=R29hIFJlc3RhdXJhbnRzIFp1YXJpbmFnYXI="))
        }

        binding.link3CvRf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.justdial.com/Goa/Table-Talks-Ward-No-I-Mormugao-Vasco-Zuarinagar/0832PX832-X832-211103015606-Z3J8_BZDET?xid=R29hIFJlc3RhdXJhbnRzIFp1YXJpbmFnYXI="))
        }

        binding.link4CvRf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.justdial.com/Goa/Baowich-Near-Mes-Zuarinagar/0832PX832-X832-210929210221-T4Z5_BZDET?xid=R29hIFJlc3RhdXJhbnRzIFp1YXJpbmFnYXI="))
        }

        binding.otherCvRf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.justdial.com/Goa/Restaurants-in-Zuarinagar/nct-10408936"))
        }

    }

}