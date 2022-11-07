package com.example.orionplus.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.orionplus.model.ConcretAddress

class DbManager (val context : Context) {

    val dbHelper = DbHelper(context)
    var db : SQLiteDatabase? = null

    fun openDB(){
        db = dbHelper.writableDatabase
    }

    fun insertToDB (addressName : String, Date : String, bitum : Int,
                    perchatki : Int, coldAsf : Int, benzin : Int,
                    disel : Int, lopSov : Int, lopSht : Int){
        val values = ContentValues().apply {
            put(AddressDB.ADDRESS_NAME, addressName)
            put(AddressDB.SHIFT_DATE, Date)
            put(AddressDB.BITUM, bitum)
            put(AddressDB.PERCHATKI, perchatki)
            put(AddressDB.COLDASF, coldAsf)
            put(AddressDB.BENZIN, benzin)
            put(AddressDB.DISEL, disel)
            put(AddressDB.LOPSOV, lopSov)
            put(AddressDB.LOPSHT, lopSht)
        }
        db?.insert(AddressDB.TABLE_NAME, null, values)
    }

    fun readDB() : ArrayList<ConcretAddress>{
        val addressList = ArrayList<ConcretAddress>()
        val cursor  = db?.query(AddressDB.TABLE_NAME, null, null, null, null, null, null)
        with(cursor){
            while(this?.moveToNext()!!){

            }
        }
        return addressList
    }
}