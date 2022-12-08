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
import com.devsoc.icaiefa_2022.databinding.FragmentAboutDevBinding

class AboutDevFragment : Fragment() {
    private lateinit var binding: FragmentAboutDevBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about_dev, container, false)

        binding.devsocLogoIvAdf.setOnClickListener{
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://devsoc.club"))
        }

        binding.mohitCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/mohit-tiwari-linked-in/"))
        }

        binding.adikulCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/aditya-handur-kulkarni-a8b30a22a/"))
        }

        binding.uvCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/yuvraj-singh-bhadauria-927a1b1b9/"))
        }

        binding.arihantCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/arihantbansal/"))
        }

        binding.anishCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/anish-sreenivas-6b59361b9/"))
        }

        binding.divyanshiCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/divyanshi-chouksey-9917b9204/"))
        }

        binding.hrishikeshCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/riskycase/"))
        }

        binding.amanCvAdf.setOnClickListener {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse("https://www.linkedin.com/in/aman-rahman-7917bb204/"))
        }

        return binding.root
    }
}