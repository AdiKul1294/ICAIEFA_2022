package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentGoalBinding

class GoalFragment : Fragment() {

    private lateinit var binding : FragmentGoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goal, container, false)

        binding.goalsTvGf.text = "The conference is aimed to cover the contemporary research on Aggregation-Induced Emission in its various sub-areas and allied branches of science such as chemical biology, material science, environmental science, etc. so as to provide a common platform for the exchange of most recent discoveries and developments leading to strengthening the fundamentals and finding applications for the progress of the society.\n" +
                "\n" +
                "The primary objective of the conference is to assemble young researchers of various sub-disciplines and interface at a single platform to exchange views and to take up challenging topics with an aim of practical applications for the benefit of mankind. During the conference, there will be Plenary/Keynote/Invited lectures of eminent scientists and also Oral presentations by young researchers. In addition, poster sessions will give ample opportunity to Research Scholars for the presentation of their recent results. There will be ORAL/POSTER competitions to recognize salient research contributions from Research Scholars in the field of AIE. Selected posters of Research Scholars will be chosen for Flash Presentation followed by Best Poster Awards to appreciate their achievements."

        binding.structureTvGf.text = "The conference will be divided into several sessions, each session will focus on a specific theme. There will be 2-3 invited speakers in each session and selected oral presentations. Invited talks will be 25-30 min long and orals presentations will be for 10-15 min. There will be poster sessions for young researcher to showcase their research.\n" +
                "\n" +
                "This Three-Days conference will feature Plenary Talks (40+10 min, 3 no.), Key-note talks (30+5 min), invited talks (20+5 min) by eminent speakers, ORAL presentations (12+3 min) by young researchers, and several FLASH presentations by research scholars."

        return binding.root
    }

}