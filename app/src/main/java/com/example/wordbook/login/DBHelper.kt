package com.example.wordbook.login

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?) :
    SQLiteOpenHelper(context, "Login.db", null, 1) {
    override fun onCreate(MyDB: SQLiteDatabase) {
        MyDB.execSQL("create Table users(id TEXT primary key, password TEXT)")
    }

    override fun onUpgrade(MyDB: SQLiteDatabase, i: Int, i1: Int) {
        MyDB.execSQL("drop Table if exists users")
    }

    fun insertData(id: String?, password: String?): Boolean {
        val MyDB = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("id", id)
        contentValues.put("password", password)
        val result = MyDB.insert("users", null, contentValues)
        return if (result == -1L) false else true
    }

    fun checkUserid(id: String): Boolean {
        val MyDB = this.writableDatabase
        var res = true
        val cursor =MyDB.rawQuery("Select * from users where id =?", arrayOf(id))
        return res
    }

    fun checkUserid(id: String, password: String): Boolean {
        val MyDB = this.writableDatabase
        var res = true
        val cursor =MyDB.rawQuery(
            "Select * from users where id = ? and password = ?",
            arrayOf(id, password)
        )
        if (cursor.count <= 0) res = false
        return res
    }

    companion object{
        const val DBNAME = "Login.db"
    }
}