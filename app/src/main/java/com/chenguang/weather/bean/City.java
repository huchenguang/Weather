package com.chenguang.weather.bean;

import java.io.Serializable;

/**
 * Created by hcg on 2018/5/5.
 */

public class City implements Serializable {

    /**
     * affiliation : 北京, 中国
     * key :
     * latitude : 39.904
     * locationKey : weathercn:101010100
     * longitude : 116.408
     * name : 北京
     * status : 0
     * timeZoneShift : 28800
     */

    public String affiliation;
    public String key;
    public double latitude;
    public String locationKey;
    public double longitude;
    public String name;
    public int status;
    public int timeZoneShift;
    public boolean isChecked;
    public boolean isLocate;//是否是定位城市
}
