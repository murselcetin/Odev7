package com.example.odev7.room

import androidx.room.*
import com.example.odev7.data.entity.Yapilacaklar

@Dao
interface YapilacakDao {
    @Query("SELECT * FROM yapilacaklar")
    suspend fun tumYapilacaklar(): List<Yapilacaklar>

    @Insert
    suspend fun isEkle(yapilacaklar: Yapilacaklar)

    @Update
    suspend fun isGuncelle(yapilacaklar: Yapilacaklar)

    @Delete
    suspend fun isSil(yapilacaklar: Yapilacaklar)

    @Query("SELECT * FROM yapilacaklar WHERE yapilacak_is like '%' ||:aramaKelimesi|| '%'")
    suspend fun isArama(aramaKelimesi: String): List<Yapilacaklar>
}