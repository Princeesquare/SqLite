package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var edWord:EditText
    private lateinit var edMean:EditText
    private lateinit var btnAdd:Button
    private lateinit var btnView:Button
    private lateinit var sqliteHelper: SqliteHelper



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();
    }
    fun init(){
        edWord = findViewById(R.id.edWord)
        edMean = findViewById(R.id.edMean)
        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)
        sqliteHelper = SqliteHelper(this)
    }
}