package com.example.orionplus.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.orionplus.model.AddressShift
import com.example.orionplus.model.ConcretAddress
import com.example.orionplus.model.StafObject

class DbManager (val context : Context) {

    private val dbHelper = DbHelper(context)
    var db : SQLiteDatabase? = null

    fun openDB(){
        db = dbHelper.writableDatabase
    }

    fun insertToDB (date : String, bitum : Short,
                    perchatki : Short, coldAsf : Short, benzin : Short,
                    disel : Short, lopSov : Short, lopSht : Short){
        val values = ContentValues().apply {
            put(AddressDB.SHIFT_DATE, date)
            put(AddressDB.BITUM, bitum)
            put(AddressDB.PERCHATKI, perchatki)
            put(AddressDB.COLDASF, coldAsf)
            put(AddressDB.BENZIN, benzin)
            put(AddressDB.DISEL, disel)
            put(AddressDB.LOPSOV, lopSov)
            put(AddressDB.LOPSHT, lopSht)
        }
        db?.insert(AddressDB.tableName, null, values)
    }

    @SuppressLint("Range")
    fun readDB() : ArrayList<ConcretAddress>{
        val addressList = ArrayList<ConcretAddress>()
        var addressName : String
        var addressShiftList  = ArrayList<AddressShift>()

        val cursor  = db?.query(AddressDB.tableName, null, null, null, null, null, null)
        while(cursor?.moveToNext()!!){
            var date = cursor.getString(cursor.getColumnIndex(AddressDB.SHIFT_DATE))
            var bitum  = cursor.getShort(cursor.getColumnIndex(AddressDB.BITUM))
            var perchatki = cursor.getShort(cursor.getColumnIndex(AddressDB.PERCHATKI))
            var coldAsf = cursor.getShort(cursor.getColumnIndex(AddressDB.COLDASF))
            var benzin = cursor.getShort(cursor.getColumnIndex(AddressDB.BENZIN))
            var disel = cursor.getShort(cursor.getColumnIndex(AddressDB.DISEL))
            var lopSov = cursor.getShort(cursor.getColumnIndex(AddressDB.LOPSOV))
            var lopSht = cursor.getShort(cursor.getColumnIndex(AddressDB.LOPSHT))
            var stafObectList  = ArrayList<StafObject>()
            stafObectList.add(StafObject(AddressDB.BITUM, bitum))
            stafObectList.add(StafObject(AddressDB.PERCHATKI, perchatki))
            stafObectList.add(StafObject(AddressDB.COLDASF, coldAsf))
            stafObectList.add(StafObject(AddressDB.BENZIN, benzin))
            stafObectList.add(StafObject(AddressDB.DISEL, disel))
            stafObectList.add(StafObject(AddressDB.LOPSOV, lopSov))
            stafObectList.add(StafObject(AddressDB.LOPSHT, lopSht))
            addressShiftList.add(AddressShift(date, stafObectList))
            if(cursor?.moveToNext()!!) cursor.moveToNext()
            addressList.add(ConcretAddress(AddressDB.tableName, addressShiftList))
        }
        return addressList
    }
}