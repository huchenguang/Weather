package com.chenguang.weather.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hcg on 2018/5/3.
 */

public class DateUtils {
    /**
     * 日期格式转换yyyy-MM-dd‘T‘HH:mm:ss.SSSXXX  TO  yyyy-MM-dd HH:mm:ss
     */
    public static String dealDateFormat(String s) {
        String str = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
            Date date = sd.parse(s);
            str = sdf.format(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return str;
        }
        return str;
    }

    public static Calendar getCalendar(String s) {
        try {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
            Date date = sd.parse(s);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e) {
            return Calendar.getInstance();
        }
    }
}
