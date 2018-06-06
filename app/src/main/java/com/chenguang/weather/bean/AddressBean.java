package com.chenguang.weather.bean;

import java.io.Serializable;

/**
 * Created by hcg on 2018/5/14.
 */

public class AddressBean implements Serializable{
    public AddressBean(City city, HeaderBean header) {
        this.city = city;
        this.header = header;
    }

    public City city;
    public HeaderBean header;

    public AddressBean() {
    }
}
