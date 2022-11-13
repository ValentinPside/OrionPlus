package com.example.orionplus.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class DbNameManager (val context : Context) {
    private val dbHelper = DbNameHelper(context)
    var db : SQLiteDatabase? = null

    fun openDB(){
        db = dbHelper.writableDatabase
    }

    fun insertToDB (addressName : String){
        val values = ContentValues().apply {
            put(AddressNameDB.ADDRESS_NAME, addressName)
        }
        db?.insert(AddressNameDB.TABLE_NAME, null, values)
    }

    @SuppressLint("Range")
    fun readDB() : ArrayList<String>{
        val addressList = ArrayList<String>()
        var addressName : String
        val cursor  = db?.query(AddressNameDB.TABLE_NAME, null, null, null, null, null, null)
        while(cursor?.moveToNext()!!){
            addressName = cursor.getString(cursor.getColumnIndex(AddressNameDB.ADDRESS_NAME))
            addressList.add(addressName)
        }
        return addressList
    }
}