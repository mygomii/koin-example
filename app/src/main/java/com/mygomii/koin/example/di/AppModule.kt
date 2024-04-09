package com.mygomii.koin.example.di

fun appModule() = listOf(
    viewModelModule,
    repositoryModule,
    networkModule,
    useCaseModule
)