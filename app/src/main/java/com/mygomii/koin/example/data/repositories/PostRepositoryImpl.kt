package com.mygomii.koin.example.data.repositories

import com.mygomii.koin.example.data.services.PostService
import com.mygomii.koin.example.domain.models.Post

class PostRepositoryImpl(private val apiService: PostService) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}