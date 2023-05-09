package com.example.sqlite

import kotlin.random.Random
import java.util.*

class ItemModel (var id:Int= getAutoid(), var word:String="", var mean:String=""){
    companion object{
        fun getAutoid():Int
        {
            val R = Random()
            return  R.nextInt(100)
        }
    }
}