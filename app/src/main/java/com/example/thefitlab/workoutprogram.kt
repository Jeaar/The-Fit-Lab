package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentLegdayBinding
import com.example.thefitlab.databinding.FragmentPushdayBinding
import com.example.thefitlab.databinding.FragmentWorkoutprogramBinding

class workoutprogram : Fragment() {

    private lateinit var binding: FragmentWorkoutprogramBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWorkoutprogramBinding.inflate(inflater, container, false)

        binding.pushCard.setOnClickListener{
            findNavController().navigate(R.id.action_workoutprogram_to_pushday)
        }

        binding.pullCard.setOnClickListener{
            findNavController().navigate(R.id.action_workoutprogram_to_pullday)
        }

        binding.legsCard.setOnClickListener{
            findNavController().navigate(R.id.action_workoutprogram_to_legday)
        }
        return binding.root
    }

}