package com.example.orionplus.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.orionplus.R
import com.example.orionplus.databinding.ActivityAddressesBinding

class Addresses : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addresses)
    }

    fun onClickNewAddress(view: View){
        val onClick = Intent(this, NewAddressActivity::class.java)
        startActivity(onClick)
    }
}