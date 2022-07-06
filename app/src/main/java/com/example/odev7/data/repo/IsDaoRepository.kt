package com.example.odev7.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.odev7.data.entity.Is

class IsDaoRepository {
    var yapilacakListesi: MutableLiveData<List<Is>>

    init {
        yapilacakListesi = MutableLiveData()
    }

    fun isleriGetir(): MutableLiveData<List<Is>> {
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
        val liste = ArrayList<Is>()
        val i1 = Is(1, "Ekmek Al")
        val i2 = Is(2, "El yıka")
        val i3 = Is(3, "Yemek Ye")
        liste.add(i1)
        liste.add(i2)
        liste.add(i3)
        yapilacakListesi.value = liste
    }
}