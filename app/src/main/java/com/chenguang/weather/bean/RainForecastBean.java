package com.chenguang.weather.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hcg on 2018/5/9.
 */

public class RainForecastBean implements Serializable{
    /**
     * precipitation : {"description":"雨已停或很快就会停了","headDescription":"未来2小时无雨",
     * "headIconType":"rain_0","isModify":false,"isRainOrSnow":2,"isShow":false,
     * "pubTime":"2018-05-09T23:33:36+08:00","shortDescription":"","status":0,"value":[0,0,0,0,0,
     * 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
     * 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
     * 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"weather":"2"}
     * status : 0
     */

    public PrecipitationBean precipitation;
    public int status;

    public static class PrecipitationBean implements Serializable{
        /**
         * description : 雨已停或很快就会停了
         * headDescription : 未来2小时无雨
         * headIconType : rain_0
         * isModify : false
         * isRainOrSnow : 2
         * isShow : false
         * pubTime : 2018-05-09T23:33:36+08:00
         * shortDescription :
         * status : 0
         * value : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
         * 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
         * 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
         * weather : 2
         */

        public String description;
        public String headDescription;
        public String headIconType;
        public boolean isModify;
        public int isRainOrSnow;
        public boolean isShow;
        public String pubTime;
        public String shortDescription;
        public int status;
        public String weather;
        public List<Double> value;
    }
}
