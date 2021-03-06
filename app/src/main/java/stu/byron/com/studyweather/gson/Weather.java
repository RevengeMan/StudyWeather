package stu.byron.com.studyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Byron on 2018/8/29.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
