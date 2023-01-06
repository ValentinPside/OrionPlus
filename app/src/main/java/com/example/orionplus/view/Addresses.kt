package com.example.orionplus.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orionplus.R
import com.example.orionplus.databinding.ActivityAddressesBinding
import com.example.orionplus.db.DbManager
import com.example.orionplus.db.DbNameManager
import com.example.orionplus.model.ConcretAddress
import com.example.orionplus.vm.AddressAdapter

class Addresses : AppCompatActivity() {

    val dbNameManager = DbNameManager(this)
    var addressNameList = ArrayList<String>()
    lateinit var binding : ActivityAddressesBinding
    private val adapter = AddressAdapter()
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddressesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init()
    }

    fun onClickNewAddress(view: View){
        val onClick = Intent(this, NewAddressActivity::class.java)
        startActivity(onClick)
    }

    private fun init(){
        binding.apply {
            addressesList.layoutManager = LinearLayoutManager(this@Addresses)
            addressesList.adapter = adapter
            dbNameManager.openDB()
            addressNameList = dbNameManager.readDB()
            while(counter < addressNameList.size){
                adapter.addAddressName(addressNameList[counter])
                counter++
            }
        }
    }
}