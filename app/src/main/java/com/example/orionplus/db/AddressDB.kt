package com.example.orionplus.db

import android.provider.BaseColumns

object AddressDB : BaseColumns {
    var tableName = "" //название адреса
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

    var createTable = "CREATE TABLE IF NOT EXISTS $tableName (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "$SHIFT_DATE TEXT," +
            "$BITUM SHORT," +
            "$PERCHATKI SHORT," +
            "$COLDASF SHORT," +
            "$BENZIN SHORT," +
            "$DISEL SHORT," +
            "$LOPSOV SHORT," +
            "$LOPSHT SHORT)"

    var deleteTable = "DROP TABLE IF EXISTS $tableName"
}