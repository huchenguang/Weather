package com.chenguang.weather.event;

import com.chenguang.weather.bean.City;

/**
 * Created by hcg on 2018/5/19.
 */

public class CityEvent {
    public City city;
    public boolean isDelete=false;

    public CityEvent(City city) {
        this.city = city;
    }
}
