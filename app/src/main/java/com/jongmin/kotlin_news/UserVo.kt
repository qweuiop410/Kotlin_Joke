package com.jongmin.kotlin_news

import com.google.gson.annotations.SerializedName

data class UserVO (
    @SerializedName("type")
    var type : String ,
    @SerializedName("value")
    var value: ArrayList<Value>
)

data class Value (
    @SerializedName("id")
    var id : String ,
    @SerializedName("joke")
    var joke : String ,
    @SerializedName("categories")
    var categories: ArrayList<String>?
)

data class Categories (
    var id : String?
)