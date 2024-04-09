package com.mygomii.koin.example.data.repositories

import com.mygomii.koin.example.domain.models.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}