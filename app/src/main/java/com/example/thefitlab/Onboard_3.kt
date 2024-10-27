package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentLegdayBinding
import com.example.thefitlab.databinding.FragmentOnboard3Binding

class Onboard_3 : Fragment() {

    private lateinit var binding: FragmentOnboard3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOnboard3Binding.inflate(inflater, container, false)

        binding.letsgo.setOnClickListener{
            findNavController().navigate(R.id.action_onboard_to_homePage)
        }
        return binding.root
    }
}