package com.jongmin.kotlin_news

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object getApiInfo {

    fun getService():RetrofitNetwork = retrofit.create(RetrofitNetwork::class.java)

    val retrofit = Retrofit
        .Builder()
        .baseUrl("https://api.icndb.com/jokes/random/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

}