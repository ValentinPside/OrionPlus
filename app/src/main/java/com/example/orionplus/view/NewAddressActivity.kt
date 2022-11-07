package com.example.orionplus.view

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.orionplus.R
import com.example.orionplus.model.AddressShift
import com.example.orionplus.model.ConcretAddress

class NewAddressActivity : AppCompatActivity() {

    var pref : SharedPreferences ? = null
    private lateinit var shift : ArrayList<AddressShift>
    private var adr : ConcretAddress  = ConcretAddress("", shift)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_address)
        pref = getSharedPreferences("ADDRESSES", Context.MODE_PRIVATE)
    }

    fun onClickCreateAddresses(view: View){
        var addressNameView : EditText =  findViewById(R.id.newAddressName)
        var addressName : String = addressNameView.editableText.toString()
        adr?.name = addressName
        saveNewAddress(adr)
        val onClick = Intent(this, Addresses::class.java)
        startActivity(onClick)
    }

    private fun saveNewAddress(address : ConcretAddress){
        val editor = pref?.edit()
        editor?.putString(adr?.name, adr?.name)
        editor?.apply()
    }
}