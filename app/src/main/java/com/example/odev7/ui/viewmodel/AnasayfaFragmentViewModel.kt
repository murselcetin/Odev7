package com.example.odev7.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.odev7.data.entity.Yapilacaklar
import com.example.odev7.data.repo.IsDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnasayfaFragmentViewModel @Inject constructor (var irepo: IsDaoRepository) : ViewModel() {
    var yapilacaklarListesi = MutableLiveData<List<Yapilacaklar>>()

    init {
        isleriYukle()
        yapilacaklarListesi = irepo.isleriGetir()
    }

    fun ara(aramaKelimesi: String) {
        irepo.isAra(aramaKelimesi)
    }

    fun sil(yapilacak_id: Int) {
        irepo.isSil(yapilacak_id)
    }

    fun isleriYukle() {
        irepo.tumIsleriAl()
    }
}