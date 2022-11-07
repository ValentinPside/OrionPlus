package com.example.orionplus.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper (context : Context) : SQLiteOpenHelper(context, AddressDB.DATABASE_NAME, null, AddressDB.DATABASE_VERSION){

    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL(AddressDB.CREATE_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL(AddressDB.DELETE_TABLE)
        onCreate(p0)
    }

}