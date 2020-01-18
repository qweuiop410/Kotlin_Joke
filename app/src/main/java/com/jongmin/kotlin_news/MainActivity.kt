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

        getApiInfo()
    }

    fun getApiInfo(){
        println("Pass 1st Line");

        val retrofit = Retrofit
            .Builder()
            .baseUrl("http://api.icndb.com/jokes/random/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        fun service() = retrofit.create(RetrofitNetwork::class.java);

//        try {
            var response = service().listUser().execute();
            if (response.isSuccessful)
                println("Response Success")
            else
                println("Response Fail")

//            service().listUser().enqueue(object : Callback<UserVO> {
//                override fun onFailure(call: Call<UserVO>?, t: Throwable?) {
//                    println(t?.message)
//                }
//
//                override fun onResponse(call: Call<UserVO>, response: Response<UserVO>) {
//                    println(response.body())
//                }
//            })
//        }
//        catch (e:Exception)
//        {
//            println("   Error   " + e.message)
//        }

        println("Pass 2nd Line")
    }
}
