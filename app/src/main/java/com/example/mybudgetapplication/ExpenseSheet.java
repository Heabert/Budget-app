package com.example.mybudgetapplication;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class ExpenseSheet extends BaseAdapter{
        private Context context; //context



        //public constructor
        public Category(Context context, ArrayList<car> items) {
            this.context = context;
            this.car = items;
        }

        @Override
        public int getCount() {
            return car.size(); //returns total of items in the list
        }

        @Override
        public Object getItem(int position) {
            return car.get(position); //returns list item at the specified position
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // inflate the layout for each list row
            if (convertView == null) {
                convertView = LayoutInflater.from(context).
                        inflate(R.layout.activity_expenses, parent, false);
            }

            // get current item to be displayed
            ClipData.Item currentItem = () getItem(position);

            // get the TextView for item name and item description
            TextView textViewItemName = (EditText)
                    EditText.findViewById(R.id.Category);
            TextView textViewItemDescription = ()
                    convertView.findViewById(R.id.Expenses);

            //sets the text for item name and item description from the current item object
            textViewItemName.setText(currentItem.getText());
            textViewItemDescription.setText(currentItem.getText());

            // returns the view for the current row
            return convertView;
        }
    }






