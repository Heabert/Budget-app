package com.example.mybudgetapplication;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DBHelper extends SQLiteOpenHelper {


    private static final String dbName = "Budget";
    private static final String Table_name = "Account";
    private static final String COL0 = "id";
    private static final String COL1 = "Balance";
    private static final String COL2 = "Expenses";

    public DBHelper(Context context) {
        super(context, Table_name, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "create table " + Table_name + " (id integer primary key autoincrement , " + COL1 + " integer, " + COL2 + " integer )";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean balance(String Balance, String Expenses) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL1, Integer.parseInt(Balance));
        cv.put(COL2, Integer.parseInt(Expenses));


        long result = db.insert(Table_name, null, cv);

        if (result == -1)
            return false;
        else
            return true;

    }

    public Cursor Data() {

        SQLiteDatabase db = this.getWritableDatabase();

        String sql = "select * from " + Table_name;

        Cursor data = db.rawQuery(sql, null);

         return data;
    }
}
