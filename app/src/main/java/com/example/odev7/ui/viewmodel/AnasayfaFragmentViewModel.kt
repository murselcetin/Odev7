package com.example.odev7.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.odev7.data.entity.Is
import com.example.odev7.data.repo.IsDaoRepository

class AnasayfaFragmentViewModel : ViewModel() {
    val irepo = IsDaoRepository()
    var yapilacaklarListesi = MutableLiveData<List<Is>>()

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