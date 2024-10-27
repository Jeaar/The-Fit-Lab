package com.example.thefitlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.thefitlab.databinding.FragmentOnboardBinding

class Onboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val element = FragmentOnboardBinding.inflate(inflater, container, false)
        element.viewPager.adapter = ViewPagerAdapter(this)
        return element.root
    }
    private inner class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
        private val fragments = listOf(
            Onboard_1(),
            Onboard_2(),
            Onboard_3()
        )
        override fun getItemCount(): Int = fragments.size

        override fun createFragment(position: Int): Fragment = fragments[position]
    }
}
