package com.chenguang.weather.bean;

import java.io.Serializable;

/**
 * Created by hcg on 2018/5/3.
 */

public class AdviseTitleBean implements Serializable {
    public String channelId;
    /**
     * header
     */
    public String headerImgUrl;
    public String headerSummary;
    /**
     * content
     */
    public String imgUrl;
    public String title;
    public String contentUrl;
}
