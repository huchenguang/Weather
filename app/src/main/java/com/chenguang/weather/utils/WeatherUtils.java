package com.chenguang.weather.utils;

import com.chenguang.weather.R;
import com.chenguang.weather.bean.WeatherBean;
import com.chenguang.weather.bean.WeatherUtilBean;

/**
 * Created by hcg on 2018/5/3.
 */

public class WeatherUtils {
    public static WeatherUtilBean getWeatherStatus(int weatherId) {
        WeatherUtilBean bean = new WeatherUtilBean();
        bean.weatherId = weatherId;
        switch (weatherId) {
            case 0:
                bean.weather = "晴";
                bean.iconRes = R.mipmap.icon_sunny;
                break;
            case 1:
                bean.weather = "多云";
                bean.iconRes = R.mipmap.icon_cloudy;
                break;
            case 2:
                bean.weather = "阴";
                bean.iconRes = R.mipmap.icon_overcast;
                break;
            case 3:
                bean.weather = "阵雨";
                bean.iconRes = R.mipmap.icon_light_rain;
                break;
            case 4:
                bean.weather = "雷阵雨";
                bean.iconRes = R.mipmap.icon_t_storm;
                break;
            case 7:
                bean.weather = "小雨";
                bean.iconRes = R.mipmap.icon_light_rain;
            case 8:
                bean.weather = "中雨";
                bean.iconRes = R.mipmap.icon_moderate_rain;
                break;
            case 9:
                bean.weather = "大雨";
                bean.iconRes = R.mipmap.icon_heavy_rain;
                break;
            case 5:
            case 6:
            default:
                bean.weather = "阴";
                bean.iconRes = R.mipmap.icon_overcast;
                break;
        }
        return bean;
    }

    public static String getAqi(int aqi) {
        if (aqi <= 50) {
            return "优";
        } else if (aqi <= 100) {
            return "良";
        } else if (aqi <= 150) {
            return "轻度";
        } else if (aqi <= 200) {
            return "中度";
        } else if (aqi <= 300) {
            return "重度";
        } else if (aqi > 300) {
            return "严重";
        }
        return "";
    }

    public static String getWeek(int week) {
        switch (week) {
            case 1:
                return "周一";
            case 2:
                return "周二";
            case 3:
                return "周三";
            case 4:
                return "周四";
            case 5:
                return "周五";
            case 6:
                return "周六";
            case 7:
                return "周日";
            default:
                return "";


        }
    }
}
