package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentEctomorphBinding
import com.example.thefitlab.databinding.FragmentEndomorphBinding

private lateinit var binding: FragmentEndomorphBinding

class endomorph : Fragment() {

    private lateinit var binding: FragmentEndomorphBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEndomorphBinding.inflate(inflater, container, false)

        binding.endosupplements.setOnClickListener{
            findNavController().navigate(R.id.action_endomorph_to_endosupplements)
        }

        binding.endomealplan.setOnClickListener{
            findNavController().navigate(R.id.action_endomorph_to_endomealplan)
        }

        binding.workoutprogram.setOnClickListener{
            findNavController().navigate(R.id.action_endomorph_to_workoutprogram)
        }

        binding.recovery.setOnClickListener{
            findNavController().navigate(R.id.action_endomorph_to_recovery)
        }


        return binding.root
    }
}