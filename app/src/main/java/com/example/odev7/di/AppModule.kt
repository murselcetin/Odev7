package com.example.odev7.di

import android.content.Context
import androidx.room.Room
import com.example.odev7.data.repo.IsDaoRepository
import com.example.odev7.room.YapilacakDao
import com.example.odev7.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideIsDaoRepository(idao: YapilacakDao): IsDaoRepository {
        return IsDaoRepository(idao)
    }

    @Provides
    @Singleton
    fun provideIsDao(@ApplicationContext context: Context): YapilacakDao {
        val vt = Room.databaseBuilder(context, Veritabani::class.java, "todo.sqlite")
            .createFromAsset("todo.sqlite").build()
        return vt.getIsDao()
    }

}