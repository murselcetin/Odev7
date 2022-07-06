package com.example.odev7.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.odev7.R
import com.example.odev7.databinding.FragmentAnasayfaBinding
import com.example.odev7.databinding.FragmentIsDetayBinding
import com.example.odev7.ui.viewmodel.IsDetayFragmetViewModel


class IsDetayFragment : Fragment() {
    private lateinit var binding: FragmentIsDetayBinding
    private lateinit var viewModel: IsDetayFragmetViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_is_detay, container, false)
        binding.isDetayFragment = this
        binding.isDetayToolbarBaslik = "Yapılacak İş Detay"

        val bundle: IsDetayFragmentArgs by navArgs()
        val yapilacakIs = bundle.yapilacakIs
        binding.isNesnesi = yapilacakIs

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: IsDetayFragmetViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonGuncelleTikla(yapilacak_id: Int, yapilacak_is: String) {
        viewModel.Guncelle(yapilacak_id, yapilacak_is)
    }
}