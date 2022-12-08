package com.devsoc.icaiefa_2022.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentVisitingPlacesBinding

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

        binding.place1CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/JJqAywWz2VWoBd1f8"))
        }

        binding.place2CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/LxWXZ25HzAuUxjgYA"))
        }

        binding.place3CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/wbmejUsFEqv1Sg9r8"))
        }

        binding.place4CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/Y6qJzBAJ1wm569Bu9"))
        }

        binding.place5CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/N7a73BLJ5x5wmbQ56"))
        }

        binding.place6CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/UGrw3chxCjvz56mUA"))
        }

        binding.place7CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/ic4zmvM57TnWJ9DK6"))
        }

        binding.place8CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/oNdkY2baHwrjTXyHA"))
        }

        binding.place9CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/rNiUentyJM6nnd9u5"))
        }

        binding.place10CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/3bZ6GJkgKbq78n779"))
        }

        binding.place11CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/r4t2mLLXkxwfKuwH7"))
        }

        binding.place12CvVpf.setOnClickListener {
            val builder : CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://maps.app.goo.gl/52jqjd56pzXB5brD6"))
        }

        return binding.root
    }

}