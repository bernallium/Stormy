package com.example.brandon.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.brandon.stormy.R;

public class DailyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        /* ArrayAdapter is a generic, meaning that the type of the items in the array needs to be specified in <angle brackets>.
        The constructor takes three parameters:
            1) the context (use this),
            2) the layout (use android.R.layout.simple_list_item_1)
            3) the array to adapt
         */

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, daysOfTheWeek);
        setListAdapter(adapter);
    }
}
