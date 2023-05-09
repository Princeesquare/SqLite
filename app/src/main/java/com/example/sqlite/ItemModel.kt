package com.example.sqlite

import java.util.*
import kotlin.random.Random as Random1

class ItemModel (var id:Int= getAutoid(), var word:String="", var mean:String=""){
    companion object{
        fun getAutoid():Int
        {
            val R = Random()
            return  R.nextInt(100)
        }
    }
}