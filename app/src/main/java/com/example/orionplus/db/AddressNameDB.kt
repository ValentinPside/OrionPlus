package com.example.orionplus.db

import android.provider.BaseColumns

object AddressNameDB : BaseColumns {
    const val TABLE_NAME = "AddressesNames"
    const val ADDRESS_NAME = "Names"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "AddressesNames.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ${AddressNameDB.TABLE_NAME} (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "${AddressNameDB.ADDRESS_NAME} TEXT"

    const val DELETE_TABLE = "DROP TABLE IF EXISTS ${AddressNameDB.TABLE_NAME}"
}