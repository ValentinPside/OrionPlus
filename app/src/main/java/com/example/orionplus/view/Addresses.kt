package com.example.orionplus.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orionplus.R
import com.example.orionplus.databinding.ActivityAddressesBinding

class Addresses : AppCompatActivity() {
    lateinit var binding : ActivityAddressesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddressesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inin()
    }

    fun inin(){
        binding.apply {
            
        }
    }
}