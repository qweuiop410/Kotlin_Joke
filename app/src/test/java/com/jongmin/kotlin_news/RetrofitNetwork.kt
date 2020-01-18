package com.jongmin.kotlin_news

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitNetwork {
    @GET("2")
    fun listUser() : Call<UserVO>
}