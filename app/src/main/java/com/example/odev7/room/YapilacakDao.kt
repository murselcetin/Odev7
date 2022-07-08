package com.example.odev7.room

import androidx.room.Dao
import androidx.room.Query
import com.example.odev7.data.entity.Yapilacaklar

@Dao
interface YapilacakDao {
    @Query("SELECT * FROM yapilacaklar")
    suspend fun tumYapilacaklar() : List<Yapilacaklar>
}