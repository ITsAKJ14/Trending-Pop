package com.example.trendingpop.data.mapper

import com.example.trendingpop.domain.model.errorHandling.ApiError
import com.example.trendingpop.domain.model.errorHandling.NetworkError
import okio.IOException
import retrofit2.HttpException


fun Throwable.toNetworkError(): NetworkError {
    val error = when (this) {
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(error = error, throwable = this)
}