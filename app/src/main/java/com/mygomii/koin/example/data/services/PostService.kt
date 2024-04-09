package com.mygomii.koin.example.data.services

import com.mygomii.koin.example.domain.models.Post
import retrofit2.http.GET

interface PostService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}