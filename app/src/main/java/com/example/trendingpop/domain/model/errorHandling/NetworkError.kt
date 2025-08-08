package com.example.trendingpop.domain.model.errorHandling

data class NetworkError(val error: ApiError,
    val throwable: Throwable?=null)

enum class ApiError(val msg: String){
    NetworkError("network error"),
    UnknownResponse("unknown response"),
    UnknownError("unknown error")
}