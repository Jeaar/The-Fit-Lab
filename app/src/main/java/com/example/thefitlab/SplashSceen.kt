package com.example.thefitlab

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.thefitlab.databinding.FragmentSplashSceenBinding

class SplashSceen : Fragment() {

    private lateinit var binding: FragmentSplashSceenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashSceenBinding.inflate(inflater, container, false)

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashSceen_to_onboard)
        }, 1500)

        return binding.root
    }
}
