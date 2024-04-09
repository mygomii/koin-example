package com.mygomii.koin.example.di

import com.mygomii.koin.example.domain.usecases.posts.PostUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostUseCase(postsRepository = get()) }
}