package com.example.odev7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data.repo.IsDaoRepository

class IsDetayFragmetViewModel : ViewModel() {
    val irepo = IsDaoRepository()
    fun Guncelle(yapilacak_id: Int, yapilacak_is: String) {
        irepo.isGuncelle(yapilacak_id, yapilacak_is)
    }
}