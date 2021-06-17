package com.example.ktortest.di

import com.example.ktortest.root.App
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

@ExperimentalCoroutinesApi
val applicationModule = module {
    single { androidApplication() as App }
}