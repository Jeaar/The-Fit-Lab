package com.example.thefitlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thefitlab.databinding.FragmentPulldayBinding

class pullday : Fragment() {
    private lateinit var binding: FragmentPulldayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPulldayBinding.inflate(inflater, container, false)

        binding.pullupsLink.setOnClickListener { openLink("https://youtu.be/3YvfRx31xDE?si=DnHnIgzuIP3lGHRJ") }
        binding.bentOverRowsLink.setOnClickListener { openLink("https://youtu.be/3YvfRx31xDE?si=DnHnIgzuIP3lGHRJ") }
        binding.seatedRowsLink.setOnClickListener { openLink("https://youtu.be/UCXxvVItLoM?si=QwGARg4gnUoBipLC") }
        binding.bicepCurlsLink.setOnClickListener { openLink("https://youtu.be/ykJmrZ5v0Oo?si=Y4WxvZ5ao435gfZk") }
        binding.concentrationCurlsLink.setOnClickListener { openLink("https://youtube.com/shorts/cHxRJdSVIkA?si=7z001tfts0gLcwqn") }
        binding.hammerCurlsLink.setOnClickListener{openLink("https://youtube.com/shorts/OPhgvwKBOwI?si=SlcdhpYRD7-3dvb6")}
        binding.rearDeltFlyLink.setOnClickListener{openLink("https://youtu.be/nlkF7_2O_Lw?si=1O-53WzrgnnYfB1D")}
        binding.reverseFlyLink.setOnClickListener{openLink("https://youtu.be/JoCRRZ3zRtI?si=2maQt-cGOTfB3T56")}
        binding.facePullsLink.setOnClickListener { openLink("https://youtu.be/0Po47vvj9g4?si=xILVaSbK3hBcyKlt") }

        return binding.root
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
