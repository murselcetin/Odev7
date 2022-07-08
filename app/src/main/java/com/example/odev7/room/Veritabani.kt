package com.example.odev7.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.odev7.data.entity.Yapilacaklar

@Database(entities = [Yapilacaklar::class], version = 1, exportSchema = false)
abstract class Veritabani : RoomDatabase() {
    abstract fun getIsDao() : YapilacakDao
}