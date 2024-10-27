package com.example.thefitlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thefitlab.databinding.FragmentEndosupplementsBinding

class endosupplements : Fragment() {
    private lateinit var binding: FragmentEndosupplementsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndosupplementsBinding.inflate(inflater, container, false)

        binding.endotdee.setOnClickListener {
            openTDEECalculator()
        }

        return binding.root
    }

    private fun openTDEECalculator() {
        val url = "https://tdeecalculator.net/"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
