package com.jongmin.kotlin_news

import com.google.gson.annotations.SerializedName

data class UserVO (
    var type : String ,
    var value: ArrayList<Value>
)

data class Value (
    var id : String ,
    var joke : String ,
    var categories: ArrayList<String>?
)

data class Categories (
    var id : String?
)