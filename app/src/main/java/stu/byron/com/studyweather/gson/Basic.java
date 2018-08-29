package stu.byron.com.studyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Byron on 2018/8/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
