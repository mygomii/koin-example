package com.mygomii.koin.example.di

import com.mygomii.koin.example.data.repositories.PostRepository
import com.mygomii.koin.example.data.repositories.PostRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<PostRepository> {
        PostRepositoryImpl(apiService = get())
    }
}