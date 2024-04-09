package com.mygomii.koin.example.domain.usecases.base

import com.mygomii.koin.example.domain.models.ApiError

interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)

    fun onError(apiError: ApiError?)
}

