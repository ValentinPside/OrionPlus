package com.example.orionplus.view

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.orionplus.R
import com.example.orionplus.db.DbNameManager

class NewAddressNameActivity : AppCompatActivity() {

    val dbManager = DbNameManager(this)
    lateinit var newAddressView : EditText
    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_address_name)
    }

    fun onClickSaveNewAddressName(view : View){
        newAddressView = findViewById(R.id.newAddress)
        name = newAddressView.text.toString()
        dbManager.openDB()
        dbManager.insertToDB(name)
    }

}