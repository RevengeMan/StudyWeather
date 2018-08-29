package stu.byron.com.studyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Byron on 2018/8/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
