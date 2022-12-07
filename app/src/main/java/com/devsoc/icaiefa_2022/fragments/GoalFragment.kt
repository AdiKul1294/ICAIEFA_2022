package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.adapters.ViewPagerAdapter
import com.devsoc.icaiefa_2022.databinding.FragmentGoalBinding

class GoalFragment : Fragment() {

    private lateinit var binding: FragmentGoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goal, container, false)

        setupTabs()

        return binding.root
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(AimsFragment(), "Aims")
        adapter.addFragment(ThrustFragment(), "Thrust Areas")
        adapter.addFragment(StructureFragment(), "Structure")
        binding.viewPagerGf.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPagerGf)
    }
}