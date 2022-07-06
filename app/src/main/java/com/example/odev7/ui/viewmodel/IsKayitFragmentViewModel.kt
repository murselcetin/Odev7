package com.example.odev7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data.repo.IsDaoRepository

class IsKayitFragmentViewModel : ViewModel() {
    val irepo = IsDaoRepository()

    fun Kayit(yapilacak_is: String) {
        irepo.isKayit(yapilacak_is)
    }
}