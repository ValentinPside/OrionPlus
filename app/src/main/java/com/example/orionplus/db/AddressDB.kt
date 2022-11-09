package com.example.orionplus.db

import android.provider.BaseColumns

object AddressDB : BaseColumns {
    const val TABLE_NAME = "address_db"
    const val ADDRESS_NAME = "Адрес"
    const val SHIFT_DATE = "Дата"
    const val BITUM : String = "Битум"
    const val PERCHATKI : String = "Перчатки"
    const val COLDASF : String = "Хол. асфальт"
    const val BENZIN : String = "Бензин"
    const val DISEL : String = "Д.Т."
    const val LOPSOV : String = "Лопата совк."
    const val LOPSHT : String = "Лопата штык."

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "Addresses.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "$ADDRESS_NAME TEXT," +
            "$SHIFT_DATE TEXT," +
            "$BITUM SHORT," +
            "$PERCHATKI SHORT," +
            "$COLDASF SHORT," +
            "$BENZIN SHORT," +
            "$DISEL SHORT," +
            "$LOPSOV SHORT," +
            "$LOPSHT SHORT)"

    const val DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}