package com.example.androiduilist

import android.content.Intent

data class Model(
    var id:Int,
    var pageName:String,
    var createdDate:String,
    var intent:Intent,
    var status:Int=0)
