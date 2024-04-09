package com.mygomii.koin.example.domain.usecases.posts

import com.mygomii.koin.example.data.repositories.PostRepository
import com.mygomii.koin.example.domain.models.Post
import com.mygomii.koin.example.domain.usecases.base.BaseUseCase

class PostUseCase(
    private val postsRepository: PostRepository
) : BaseUseCase<List<Post>, Any?>() {

    override suspend fun run(params: Any?): List<Post> {
        return postsRepository.getPosts()
    }

}