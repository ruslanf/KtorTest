package com.example.ktortest.root

import android.app.Application
import com.example.ktortest.di.applicationModule
import com.example.ktortest.di.networkModule
import com.example.ktortest.di.repositoryModule
import com.example.ktortest.di.viewModelModule
import com.jakewharton.threetenabp.AndroidThreeTen
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@ExperimentalCoroutinesApi
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(
                applicationModule,
                networkModule,
//                storageModule,
//                dataBaseModule,
                repositoryModule,
                viewModelModule
            ))
        }
    }
}