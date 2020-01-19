package com.jongmin.kotlin_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // API 호출
        getApiInfo.getService().listUser().enqueue(object : Callback<UserVO>{
            override fun onResponse(call: Call<UserVO>, response: Response<UserVO>) {
                println("   onResponse   : " + response.body())
                println("   Use Thread   : " + Thread.currentThread().name)
            }

            override fun onFailure(call: Call<UserVO>, t: Throwable) {
                println("   onFailure   : " + t.message)
            }
        })
    }
}
