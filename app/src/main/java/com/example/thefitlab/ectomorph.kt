package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentEctomorphBinding
import com.example.thefitlab.databinding.FragmentHomePageBinding


class ectomorph : Fragment() {
    private lateinit var binding: FragmentEctomorphBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEctomorphBinding.inflate(inflater, container, false)

        binding.ectosupplements.setOnClickListener{
            findNavController().navigate(R.id.action_ectomorph_to_supplements)
        }

        binding.ectomealplan.setOnClickListener{
            findNavController().navigate(R.id.action_ectomorph_to_mealplan)
        }

        binding.workoutprogram.setOnClickListener{
            findNavController().navigate(R.id.action_ectomorph_to_workoutprogram)
        }

        binding.recovery.setOnClickListener{
            findNavController().navigate(R.id.action_ectomorph_to_recovery)
        }


        return binding.root
    }
}