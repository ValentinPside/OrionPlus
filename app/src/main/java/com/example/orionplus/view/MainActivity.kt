package com.example.orionplus.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.orionplus.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMaterials(view: View){
        val onClick = Intent(this, Materials::class.java)
        startActivity(onClick)
    }

    fun onClickAddresses(view: View){
        val onClick = Intent(this, Addresses::class.java)
        startActivity(onClick)
    }
}