package com.example.odev7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data.repo.IsDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsDetayFragmetViewModel @Inject constructor (var irepo: IsDaoRepository): ViewModel() {
    fun Guncelle(yapilacak_id: Int, yapilacak_is: String) {
        irepo.isGuncelle(yapilacak_id, yapilacak_is)
    }
}