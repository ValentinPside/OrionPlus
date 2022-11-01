package com.example.orionplus.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.orionplus.R

class NewAddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_address)
    }

    fun onClickCreateAddresses(view: View){
        var addressNameView : EditText =  findViewById(R.id.newAddressName)
        var addressName : String = addressNameView.editableText.toString()
        val onClick = Intent(this, Addresses::class.java)
        startActivity(onClick)
    }
}