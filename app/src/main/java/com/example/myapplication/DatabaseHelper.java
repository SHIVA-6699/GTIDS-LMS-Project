package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String databaseName = "SignLog.db";


     public DatabaseHelper(@Nullable Context context)
     {
         super(context,"SignLog.db",null,1);
     }


    @Override

    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table users(email TEXT primary key,password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists users");

    }

    public boolean insertData(String email, String password) {
        SQLiteDatabase Database = this.getWritableDatabase();
        ContentValues ContentValues = new ContentValues();
        ContentValues.put("email", email);
        ContentValues.put("password", password);
        long result = Database.insert("users", null, ContentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Boolean checkEmail(String email){
        SQLiteDatabase Database=this.getWritableDatabase();
        String sql;
        Cursor cursor=Database.rawQuery(sql="Select * from users where email=?",new String[]{email});

        if(cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkEmailPassword(String email,String password){
        SQLiteDatabase Database=this.getWritableDatabase();
        Cursor cursor=Database.rawQuery("Select* from users where email=? and password=?",new String[]{email,password} );


        if(cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
}