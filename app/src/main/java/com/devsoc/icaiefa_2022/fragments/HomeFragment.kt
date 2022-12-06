package com.devsoc.icaiefa_2022.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devsoc.icaiefa_2022.R
import com.devsoc.icaiefa_2022.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goalsCvHf.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_nav_goal)
        }
        binding.speakersCvHf.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_nav_speakers)
        }
        binding.sponsorsCvHf.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_nav_sponsors)
        }
        binding.mapsCvHf.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_nav_maps)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}