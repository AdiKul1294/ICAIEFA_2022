package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentAimsBinding

class AimsFragment : Fragment() {
    private lateinit var binding : FragmentAimsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_aims, container, false)
        binding.goalsTvGf.text = "The conference is aimed to cover the contemporary research on Aggregation-Induced Emission in its various sub-areas and allied branches of science such as chemical biology, material science, environmental science, etc. so as to provide a common platform for the exchange of most recent discoveries and developments leading to strengthening the fundamentals and finding applications for the progress of the society.\n" +
                "\n" +
                "The primary objective of the conference is to assemble young researchers of various sub-disciplines and interface at a single platform to exchange views and to take up challenging topics with an aim of practical applications for the benefit of mankind. During the conference, there will be Plenary/Keynote/Invited lectures of eminent scientists and also Oral presentations by young researchers. In addition, poster sessions will give ample opportunity to Research Scholars for the presentation of their recent results. There will be ORAL/POSTER competitions to recognize salient research contributions from Research Scholars in the field of AIE. Selected posters of Research Scholars will be chosen for Flash Presentation followed by Best Poster Awards to appreciate their achievements."
        return binding.root
    }

}