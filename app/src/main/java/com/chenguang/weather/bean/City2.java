package com.chenguang.weather.bean;

import java.util.List;

/**
 * Created by hcg on 2018/5/12.
 */

public class City2 {

    /**
     * data : [{"city_level_name":"广州市","country":"中国","upper":"广州市","name":"黄埔区",
     * "prov_en":"guangdong","cityid":"101280111","city_level_id":"101280101","type":0,"prov":"广东"}]
     * status : 1000
     * desc : OK
     */

    public int status;
    public String desc;
    public List<DataBean> data;

    public static class DataBean {
        /**
         * city_level_name : 广州市
         * country : 中国
         * upper : 广州市
         * name : 黄埔区
         * prov_en : guangdong
         * cityid : 101280111
         * city_level_id : 101280101
         * type : 0
         * prov : 广东
         */

        public String city_level_name;
        public String country;
        public String upper;
        public String name;
        public String prov_en;
        public String cityid;
        public String city_level_id;
        public int type;
        public String prov;
    }
}
