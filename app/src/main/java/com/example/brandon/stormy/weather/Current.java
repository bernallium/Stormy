// This will be the model for the project

package com.example.brandon.stormy.weather;

import android.text.style.ForegroundColorSpan;

import com.example.brandon.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Current {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        Forecast.getIconId(mIcon);
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        // Need to set the time appropriately in accordance with the desired timezone
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        // Need to multiply by 1000 since we need a time in milliseconds and getTime() provides a time in seconds
        Date dateTime = new Date(getTime() * 1000);
        // Formats the DateTime object into a String according to the format passed into the formatter object
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        long fahrenheit = Math.round(mTemperature);
        return (int) ((fahrenheit - 32) * 5 / 9);
    }

    public void setTemperature(double temperature) { mTemperature = temperature; }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int) Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) { mPrecipChance = precipChance; }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
    public String getTimezone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}