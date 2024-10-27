package com.example.thefitlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thefitlab.databinding.FragmentLegdayBinding
import com.example.thefitlab.databinding.FragmentPushdayBinding


class legday : Fragment() {
    private lateinit var binding: FragmentLegdayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLegdayBinding.inflate(inflater, container, false)

        binding.squatsLink.setOnClickListener { openLink("https://youtu.be/gcNh17Ckjgg?si=Cw8Ec-Wpl2pXA8sj") }
        binding.legPressLink.setOnClickListener { openLink("https://youtu.be/xq2-vebNe6I?si=LBZb-3CLtZGmUVuj") }
        binding.lungesLink.setOnClickListener { openLink("https://youtu.be/9gglI77Kzq8?si=ILd_PfJDzAbO5_vp") }
        binding.calfRaisesLink.setOnClickListener { openLink("https://youtu.be/SRUtMJ0tE2A?si=kqlmGvl0RtyBdWr2") }
        binding.squatsLink.setOnClickListener { openLink("https://youtu.be/3ZRe_QpvRPg?si=ihpjQJNF8qQouuUt") }
        binding.donkeyCalfRaisesLink.setOnClickListener{openLink("https://youtu.be/FtD0qv9P7O0?si=id9MguOSj6-kq8-O")}
        return binding.root
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
