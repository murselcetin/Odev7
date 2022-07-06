package com.example.odev7.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev7.R
import com.example.odev7.databinding.FragmentIsKayitBinding


class IsKayitFragment : Fragment() {
    private lateinit var binding: FragmentIsKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIsKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

}