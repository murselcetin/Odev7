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
        Log.e("İş Kayıt", "$yapilacak_is")
    }

    fun isGuncelle(yapilacak_id: Int, yapilacak_is: String) {
        Log.e("İş Güncelle", "$yapilacak_id - $yapilacak_is")
    }

    fun isAra(aramaKelimesi: String) {
        Log.e("İş Ara", aramaKelimesi)
    }

    fun isSil(yapilacak_id: Int) {
        Log.e("İş Sil", yapilacak_id.toString())
    }

    fun tumIsleriAl() {
        val job = CoroutineScope(Dispatchers.Main).launch {
            yapilacakListesi.value = idao.tumYapilacaklar()
        }
    }
}