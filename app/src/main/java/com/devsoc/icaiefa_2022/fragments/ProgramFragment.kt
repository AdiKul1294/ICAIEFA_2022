package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentProgramBinding

class ProgramFragment : Fragment() {
    private lateinit var binding : FragmentProgramBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_program, container, false)

        val webView = binding.programWvPf
        webView.webViewClient = WebViewClient()
        webView.settings.builtInZoomControls = true
        webView.settings.javaScriptEnabled = true
        val url = "https://www.bits-goa.ac.in/ICAIEFA2022/Download/Programe-File-ICAIEFA%202022_12th-Dec-2022.pdf"
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")

        return binding.root
    }

}