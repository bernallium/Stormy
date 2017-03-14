package com.example.brandon.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brandon.stormy.R;
import com.example.brandon.stormy.weather.Day;

public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayAdapter (Context context, Day[] days) {
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() { // Gets the number items in the array that this adapter is using.
        return mDays.length;
    }

    @Override

    public Object getItem(int position) { // Gets the items for the adapter given a certain position;
        return mDays[position];
    }

    @Override
    public long getItemId(int position) { // Nog going to use this. Would be used to tag items for easy reference.
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // getView is called to create the view for each item being adopted.
        // int position matches the data object to the specific view in the list that is being displayed.
        Viewholder holder;
        /* View holders (a special helper class) allows you to re-use the same references to objects
        in the view like text views and image views, for example.
        Allows re-using of views for smooth scrolling */

        if (convertView == null ) { // The first time getView is called, convertView is null.
            // It will be will be re-used with refreseshed daya on subsqeuent calls.

            // Brand new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            // LayoutInflater is an Android object that takes xml layouts and turns them into Views in code that we can use. */
            holder = new Viewholder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) convertView.findViewById(R.id.temperatureLabel);
            holder.dayLabel = (TextView) convertView.findViewById(R.id.dayNameLabel);

            convertView.setTag(holder); // Sets a tag (holder) for this view (convertView).
        }
        else {
            holder = (Viewholder) convertView.getTag();
        }

        // Setting the data
        Day day = mDays[position];
        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek());

        return convertView;
    }

    // Added as a nexted class
    private static class Viewholder {
        ImageView iconImageView; // public by default
        TextView temperatureLabel;
        TextView dayLabel;

    }
}
