package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentStructureBinding

class StructureFragment : Fragment() {
    private lateinit var binding : FragmentStructureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_structure, container, false)
        binding.structTvStructf.text = "The conference will be divided into several sessions, each session will focus on a specific theme. There will be 2-3 invited speakers in each session and selected oral presentations. Invited talks will be 25-30 min long and orals presentations will be for 10-15 min. There will be poster sessions for young researcher to showcase their research.\n" +
                "\n" +
                "This Three-Days conference will feature Plenary Talks (40+10 min, 3 no.), Key-note talks (30+5 min), invited talks (20+5 min) by eminent speakers, ORAL presentations (12+3 min) by young researchers, and several FLASH presentations by research scholars."
        return binding.root
    }

}