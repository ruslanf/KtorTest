package com.example.ktortest.di

import android.content.Context
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.*

val networkModule = module {
//    val logger = run {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.apply {
//            interceptor.level =
//                if (BuildConfig.DEBUG)
//                    HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
//        }
//    }
//
//    val connectionSpec = ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
//        .tlsVersions(TlsVersion.TLS_1_2)
//        .cipherSuites(
//            CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
//            CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
//            CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256
//        )
//        .build()
//
//    fun httpClient(
//        context: Context,
//        tokenInterceptor: TokenInterceptor,
//        connectivityInterceptor: ConnectivityInterceptor,
//        errorCodeInterceptor: ErrorCodeInterceptor
//    ): OkHttpClient {
//        val cacheSize = (10 * 1024 * 1024).toLong()
//        val httpCacheDirectory = File(context.cacheDir, "offlineCache")
//        val httpCache = Cache(httpCacheDirectory, cacheSize)
//
//        return OkHttpClient.Builder()
//            .cache(httpCache)
//            .connectionSpecs(Collections.singletonList(connectionSpec))
//            .addNetworkInterceptor(cacheInterceptor())
//            .addInterceptor(offlineCacheInterceptor(context))
////            .addInterceptor(connectivityInterceptor)
//            .addInterceptor(tokenInterceptor)
//            .addInterceptor(errorCodeInterceptor)
//            .addInterceptor(logger)
//            .build()
//    }
//
//    fun provideRetrofit(httpClient: OkHttpClient, url: String): Retrofit =
//        Retrofit.Builder()
//            .baseUrl(url)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(httpClient)
//            .build()
//
//    fun provideApi(retrofit: Retrofit): DataApi = retrofit.create(DataApi::class.java)
//
//    factory { ConnectivityInterceptor(androidContext()) }
//    factory { ErrorCodeInterceptor() }
//    factory { TokenInterceptor(get()) }
//    factory { httpClient(androidContext(), get(), get(), get()) }
//    single { provideRetrofit(get(), if (BuildConfig.DEBUG) DEV_API_URL else API_MAIN_URL) }
//    factory { provideApi(get()) }
}
