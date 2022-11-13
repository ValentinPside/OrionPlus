package com.example.orionplus.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbNameHelper (context : Context) : SQLiteOpenHelper(context, AddressNameDB.DATABASE_NAME,
    null, AddressNameDB.DATABASE_VERSION) {

    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL(AddressNameDB.CREATE_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL(AddressNameDB.DELETE_TABLE)
        onCreate(p0)
    }
}