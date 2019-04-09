package com.example.mybudgetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void account(View V){
        Intent account = new Intent(this,Account.class);
        startActivity(account);
    }
    public void expenses(View V){
        Intent expenses = new Intent(this,Expenses.class);
        startActivity(expenses);
    }
}
