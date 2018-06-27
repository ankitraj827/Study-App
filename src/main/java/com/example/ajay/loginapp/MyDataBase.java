package com.example.ajay.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ankit Raj on 31-03-2018.
 */

public class MyDataBase extends SQLiteOpenHelper {
    public static final String db_name="my_dbb";
    public static final int dv1=1;
    public static final String table_name="anku";
    Context ct;
    public MyDataBase(Context context) {
        super(context, db_name, null, dv1);
        this.ct=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table anku (name text , email text , password text , mobile integer)";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ table_name);
        onCreate(sqLiteDatabase);
    }
    public void insertValue(Person person)
    {
        //Toast.makeText(ct,"Insert performebd",Toast.LENGTH_LONG).show();
        SQLiteDatabase s1=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name", person.getUsername());
        cv.put("email", person.getEmail());
        cv.put("password",person.getPassword());
        //cv.put("mobile",person.getMobile_no());
        s1.insert("anku",null,cv);
        Toast.makeText(ct,"Insert performebd",Toast.LENGTH_LONG).show();
    }
    public ArrayList<Person> checkValue()
    {
        SQLiteDatabase s2=getReadableDatabase();
        ArrayList<Person> p=new ArrayList<>();
        String s1="select * from anku";
        Cursor cursor=s2.rawQuery(s1,null);
        while(cursor.moveToNext())
        {
            String name=cursor.getString(0);
            String password=cursor.getString(2);
            Person m1=new Person();
            m1.setUsername(name);
            m1.setPassword(password);
            p.add(m1);
        }
        return p;
    }
}
