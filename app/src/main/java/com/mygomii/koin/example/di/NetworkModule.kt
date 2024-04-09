package com.mygomii.koin.example.di

import com.google.gson.GsonBuilder
import com.mygomii.koin.example.data.services.PostService
import okhttp3.OkHttpClient
import okhttp3.Protocol
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://jsonplaceholder.typicode.com"

val networkModule = module {
    single(createdAtStart = false) { get<Retrofit>().create(PostService::class.java) }

    single {
        OkHttpClient.Builder().apply {
            protocols(listOf(Protocol.HTTP_1_1))
            retryOnConnectionFailure(false)
        }.build()
    }

    single { GsonBuilder().setLenient().create() }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(get()))
            .client(get())
            .build()
    }
}


