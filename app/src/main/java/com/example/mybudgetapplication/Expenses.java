package com.example.mybudgetapplication;

import android.app.Activity;
import android.icu.util.ULocale;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

class MainActivity extends AppCompatActivity implements OnItemSelectedListener{
        String[] category = { "Car","Rent", "Loans", "Food", "Misc"};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_expenses);

            Spinner spin = () findViewById(R.id.spinner);
            spin.setOnItemSelectedListener(this);


            ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.,category);
            aa.setDropDownViewResource(android.R.layout.);

            spin.setAdapter(aa);

        }



        public void select(AdapterView<?> arg0, View arg1, int position, long id) {
            Toast.makeText(getApplicationContext(),category[position] , Toast.LENGTH_LONG).show();
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onNothingSelected(AdapterView<?> arg0) {

        }
    }