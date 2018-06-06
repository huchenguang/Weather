package com.chenguang.weather.bean;

import java.io.Serializable;

/**
 * Created by tb on 2017/5/22.
 */

public class OutLookWeather implements Serializable {
    /**
     * 周几
     */
    public String week;
    /**
     * 日期
     */
    public String date;
    /**
     * 白天天气
     */
    public WeatherUtilBean weatherDay;
    /**
     * 晚上天气
     */
    public WeatherUtilBean weatherNight;
    /**
     * 风向
     */
    public String wind;
    /**
     * 风力
     */
    public String windLevel;
    /**
     * 最高温度
     */
    public int highTemperature;
    /**
     * 最低温度
     */
    public int lowTemperature;
    /**
     * 空气质量
     */
    public String airQuality;

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWindLevel() {
        return windLevel;
    }

    public void setWindLevel(String windLevel) {
        this.windLevel = windLevel;
    }

    public int getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }

    public int getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(int lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(String airQuality) {
        this.airQuality = airQuality;
    }
}
