package com.example.odev7.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev7.R
import com.example.odev7.databinding.FragmentAnasayfaBinding
import com.example.odev7.databinding.FragmentIsDetayBinding


class IsDetayFragment : Fragment() {
    private lateinit var binding: FragmentIsDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIsDetayBinding.inflate(inflater, container, false)
        return binding.root
    }

}