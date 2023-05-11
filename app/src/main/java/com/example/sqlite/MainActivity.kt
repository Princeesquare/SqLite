package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
        additem();
    }
    fun init(){
        edWord = findViewById(R.id.edWord)
        edMean = findViewById(R.id.edMean)
        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)
        sqliteHelper = SqliteHelper(this)
    }
    fun additem(){
        val word = edWord.text.toString()
        val mean = edMean.text.toString()
        if (word.isNullOrEmpty() || mean.isNullOrEmpty())
            Toast.makeText(this, "Please enter the fields", Toast.LENGTH_LONG).show()
        else{
            var itm = ItemModel(word = word, mean = mean)
           val status = sqliteHelper.insertItem(itm)
            if (status < 0)
                Toast.makeText(this, "Record is not saved", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Record saved", Toast.LENGTH_LONG).show()
        }
    }
}