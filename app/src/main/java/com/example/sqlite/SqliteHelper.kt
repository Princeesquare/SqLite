package com.example.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SqliteHelper(context: Context, DATABASE_NAME: String?, DATABASE_VERSION: Int):
    SQLiteOpenHelper(context,DATABASE_NAME, null, DATABASE_VERSION){
    companion object{
        private val DATABASE_NAME = "Dictionary.db"
        private val DATABASE_VERSION = 1
        private val ID = "id"
        private val WORD = "word"
        private val MEAN = "mean"
        private val TBL_ITEM = "tbl_item"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTblItem = ("CREATE TABLE" + TBL_ITEM + "(" +
                ID + "INTEGTER PRIMARY KEY, " +
                WORD + "TEXT, " +
                MEAN + "TEXT," + ")")

        db?.execSQL(createTblItem)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}