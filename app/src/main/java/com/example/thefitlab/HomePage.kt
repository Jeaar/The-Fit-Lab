package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentHomePageBinding


class HomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        binding.guidline.setOnClickListener{
            findNavController().navigate(R.id.action_homePage_to_guidelines)
        }

        binding.ectomorph.setOnClickListener{
            findNavController().navigate(R.id.action_homePage_to_ectomorph)
        }

        binding.mesomorph.setOnClickListener{
            findNavController().navigate(R.id.action_homePage_to_mesomorph)
        }

        binding.endomorph.setOnClickListener{
            findNavController().navigate(R.id.action_homePage_to_endomorph)
        }
        return binding.root
    }
}