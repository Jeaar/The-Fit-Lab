package com.example.thefitlab

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentEctomorphBinding
import com.example.thefitlab.databinding.FragmentMesomorphBinding

private lateinit var binding: FragmentMesomorphBinding

class mesomorph : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMesomorphBinding.inflate(inflater, container, false)

        binding.mesosupplements.setOnClickListener{
            findNavController().navigate(R.id.action_mesomorph_to_mesosupplements)
        }

        binding.mesomealplan.setOnClickListener{
            findNavController().navigate(R.id.action_mesomorph_to_mesomealplan)
        }

        binding.workoutprogram.setOnClickListener{
            findNavController().navigate(R.id.action_mesomorph_to_workoutprogram)
        }

        binding.recovery.setOnClickListener{
            findNavController().navigate(R.id.action_mesomorph_to_recovery)
        }


        return binding.root
    }
}