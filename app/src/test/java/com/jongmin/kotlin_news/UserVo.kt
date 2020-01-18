package com.jongmin.kotlin_news

data class UserVO (
    var type : String ,
    var value: ArrayList<Value>
)

data class Value (
    var id : String ,
    var joke : String ,
    var categories: ArrayList<Categories>?
)

data class Categories (
    var id : String?
)