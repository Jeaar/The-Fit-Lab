package com.example.thefitlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thefitlab.databinding.FragmentPushdayBinding

class pushday : Fragment() {
    private lateinit var binding: FragmentPushdayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPushdayBinding.inflate(inflater, container, false)

        binding.benchPressLink.setOnClickListener { openLink("https://youtu.be/4Y2ZdHCOXok?si=vrmzq6ean-gfg1MW") }
        binding.inclineBenchPressLink.setOnClickListener { openLink("https://youtu.be/2jFFCy8JBU8?si=pymp0WG11_37_dmZ") }
        binding.chestFlyLink.setOnClickListener { openLink("https://youtu.be/eGjt4lk6g34?si=7sJQQxvA7Nb3_9df") }
        binding.tricepsDipsLink.setOnClickListener { openLink("https://youtu.be/5M3YZj4VItM?si=NTxgD3aVtXh2IbPu") }
        binding.overheadTricepsExtensionLink.setOnClickListener { openLink("https://youtu.be/KM38J8UJbTA?si=mkIIOsf2F7ZcJk8r") }
        binding.tricepushdown.setOnClickListener { openLink("https://youtu.be/LXkCrxn3caQ?si=xunX3ExwOzJSEJKS") }
        binding.shoulderPressLink.setOnClickListener { openLink("https://youtu.be/dyW0Ne9b2C4?si=kcl9K2FkC7C2Mw7H") }
        binding.lateralRaiseLink.setOnClickListener { openLink("https://youtu.be/ZP4D6A_73iM?si=dvw2Z26WgToZtTQ8") }
        binding.frontRaiseLink.setOnClickListener { openLink("https://youtu.be/vhGJmY_zk48?si=3Nfsu23tH5Q3INxr") }

        return binding.root
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
