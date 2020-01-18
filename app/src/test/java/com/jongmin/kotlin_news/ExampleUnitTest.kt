package com.jongmin.kotlin_news

import android.media.Image
import android.util.Log
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun getApiInfo(){
        println("Pass 1st Line");

        val retrofit = Retrofit
            .Builder()
            .baseUrl("http://api.icndb.com/jokes/random/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        fun service() = retrofit.create(RetrofitNetwork::class.java);

        val response = service().listUser().execute();
        if(response.isSuccessful)
            println("Response Success")
        else
            println("Response Fail")

        service().listUser().enqueue(object : Callback<UserVO> {
            override fun onFailure(call: Call<UserVO>?, t: Throwable?) {
                println(t?.message)
            }
            override fun onResponse(call: Call<UserVO>, response: Response<UserVO>) {
                println(response.body())
            }
        })

        println("Pass 2nd Line")
    }

//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }
}
