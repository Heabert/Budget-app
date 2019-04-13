package com.example.mybudgetapplication;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import java.util.ArrayList;


public class Account extends AppCompatActivity {
    EditText balance;
    EditText expense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }
//ADDING NUMBERS
    public void ACCOUNT(View v) {

         balance = (EditText) findViewById(R.id.Bal);
        expense = (EditText) findViewById(R.id.EXP);



        update();
    }
// UPDATE AND STORING
    private void update() {
        EditText lv = (EditText) findViewById(R.id.Bal);
        EditText LVV = (EditText) findViewById(R.id.EXP);
        ArrayList<String> userDataFromDB = new ArrayList<>();

        DBHelper dbH = new DBHelper(this);

        Cursor data = dbH.Data();

        while (data.moveToNext()) {

            userDataFromDB.add(data.getString(1));
            userDataFromDB.add(data.getString(2));
        }

    }
@Override
    protected void onStop() {
        super.onStop();

    DBHelper dbH = new DBHelper(this);

    boolean result = dbH.balance(balance.getText().toString(),expense.getText().toString() );
    }

}
