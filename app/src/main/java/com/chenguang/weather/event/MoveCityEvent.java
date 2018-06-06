package com.chenguang.weather.event;

import com.chenguang.weather.bean.City;

public class MoveCityEvent {
    public MoveCityEvent(City sourceCity, City desCity) {
        this.sourceCity = sourceCity;
        this.desCity = desCity;
    }

    public City sourceCity;
    public City desCity;
}
