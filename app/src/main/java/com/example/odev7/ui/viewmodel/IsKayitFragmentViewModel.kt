package com.example.odev7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev7.data.repo.IsDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IsKayitFragmentViewModel @Inject constructor (var irepo: IsDaoRepository) : ViewModel() {
    fun Kayit(yapilacak_is: String) {
        irepo.isKayit(yapilacak_is)
    }
}