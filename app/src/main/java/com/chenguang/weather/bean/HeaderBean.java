package com.chenguang.weather.bean;

import java.io.Serializable;

/**
 * Created by hcg on 2018/5/9.
 */

public class HeaderBean implements Serializable {
    public int currTemp;
    public String address;
    public WeatherUtilBean weather;
    public int aqi;
    public String aqiStr;
    public String hourForecast;
}
