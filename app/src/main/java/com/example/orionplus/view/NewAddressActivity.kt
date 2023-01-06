package com.example.orionplus.view

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.orionplus.R
import com.example.orionplus.databinding.ActivityNewAddressBinding
import com.example.orionplus.db.AddressDB
import com.example.orionplus.db.DbManager
import com.example.orionplus.model.AddressShift
import com.example.orionplus.model.ConcretAddress

class NewAddressActivity : AppCompatActivity() {

    private val dbManager = DbManager(this)
    lateinit var addressName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_address)
        //var addressName = findViewById<EditText>(R.id.newAddressName)
    }

    fun onClickCreateAddresses(view: View){
        AddressDB.tableName = addressName.text.toString()
        dbManager.openDB()
        dbManager.insertToDB("", 0, 0, 0, 0, 0, 0, 0)
        val onClick = Intent(this, Addresses::class.java)
        startActivity(onClick)
    }
}