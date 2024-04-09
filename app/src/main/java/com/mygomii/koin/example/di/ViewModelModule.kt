package com.mygomii.koin.example.di

import com.mygomii.koin.example.presentation.main.MainViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single {
        MainViewModel(
            postUseCase = get()
        )
    }
}