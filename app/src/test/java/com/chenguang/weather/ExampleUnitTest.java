package com.chenguang.weather;

import com.chenguang.weather.utils.DateUtils;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test() {
        //2018-05-03T23:00:00+08:00
        //2016-09-03T00:00:00.000+08:00
        Calendar calendar = DateUtils.getCalendar("2018-05-03T23:00:00+08:00");
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
    }
}