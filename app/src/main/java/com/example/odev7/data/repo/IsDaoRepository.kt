package com.example.odev7.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.odev7.data.entity.Yapilacaklar
import com.example.odev7.room.YapilacakDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class IsDaoRepository(var idao: YapilacakDao) {
    var yapilacakListesi: MutableLiveData<List<Yapilacaklar>>

    init {
        yapilacakListesi = MutableLiveData()
    }

    fun isleriGetir(): MutableLiveData<List<Yapilacaklar>> {
        return yapilacakListesi
    }

    fun isKayit(yapilacak_is: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val yeniIs = Yapilacaklar(0, yapilacak_is)
            idao.isEkle(yeniIs)
        }
    }

    fun isGuncelle(yapilacak_id: Int, yapilacak_is: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val guncellenenIs = Yapilacaklar(yapilacak_id, yapilacak_is)
            idao.isGuncelle(guncellenenIs)
        }
    }

    fun isAra(aramaKelimesi: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            yapilacakListesi.value = idao.isArama(aramaKelimesi)
        }
    }

    fun isSil(yapilacak_id: Int) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenIs = Yapilacaklar(yapilacak_id, "")
            idao.isSil(silinenIs)
            tumIsleriAl()
        }
    }

    fun tumIsleriAl() {
        val job = CoroutineScope(Dispatchers.Main).launch {
            yapilacakListesi.value = idao.tumYapilacaklar()
        }
    }
}