package com.chenguang.weather.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hcg on 2018/4/30.
 */

public class WeatherForecastBean implements Serializable{
    /**
     * alerts : []
     * aqi : {"aqi":"52","brandInfo":{"brands":[{"brandId":"CNEMC","logo":"",
     * "names":{"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"},"url":""}]},"co":"0.7",
     * "coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","no2":"33",
     * "no2Desc":"短期浓度超过200微克/立方米时，二氧化氮是一种引起呼吸道严重发炎的有毒气体","o3":"67",
     * "o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","pm10":"54",
     * "pm10Desc":"PM10的主要来源是建筑活动和从地表扬起的尘土，含有氧化物矿物和其他成分","pm25":"31",
     * "pm25Desc":"PM2.5指的是直径小于或等于2.5微米的颗粒物，又称为细颗粒物","primary":"",
     * "pubTime":"2018-04-30T13:00:00+08:00","so2":"14",
     * "so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","src":"中国环境监测总站","status":0,
     * "suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响"}
     * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img
     * .com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp",
     * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""},{"brandId":"weatherbj",
     * "logo":"","names":{"en_US":"北京气象局","zh_CN":"北京气象局","zh_TW":"北京气象局"},"url":""}]}
     * current : {"feelsLike":{"unit":"℃","value":"30.4"},"humidity":{"unit":"%","value":"65"},
     * "pressure":{"unit":"mb","value":"1012.0"},"pubTime":"2018-04-30T14:04:00+08:00",
     * "temperature":{"unit":"℃","value":"29"},"uvIndex":"2","visibility":{"unit":"km",
     * "value":""},"weather":"2","wind":{"direction":{"unit":"°","value":"180"},
     * "speed":{"unit":"km/h","value":"12.6"}}}
     * forecastDaily : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun",
     * "logo":"http://f5.market.mi-img
     * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
     * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]},
     * "pubTime":"2018-04-30T00:00:00+08:00","status":0,"value":[52,51,57,31,19,43,51,47,8,7,7,
     * 16,19,38,19]},"precipitationProbability":{"status":0,"value":["55","59","55","55","22"]},
     * "pubTime":"2018-04-30T13:00:00+08:00","status":0,"sunRiseSet":{"status":0,
     * "value":[{"from":"2018-04-30T05:54:00+08:00","to":"2018-04-30T18:53:00+08:00"},
     * {"from":"2018-05-01T05:53:00+08:00","to":"2018-05-01T18:54:00+08:00"},
     * {"from":"2018-05-02T05:52:00+08:00","to":"2018-05-02T18:54:00+08:00"},
     * {"from":"2018-05-03T05:52:00+08:00","to":"2018-05-03T18:55:00+08:00"},
     * {"from":"2018-05-04T05:51:00+08:00","to":"2018-05-04T18:55:00+08:00"},
     * {"from":"2018-05-05T05:51:00+08:00","to":"2018-05-05T18:56:00+08:00"},
     * {"from":"2018-05-06T05:50:00+08:00","to":"2018-05-06T18:56:00+08:00"},
     * {"from":"2018-05-07T05:49:00+08:00","to":"2018-05-07T18:57:00+08:00"},
     * {"from":"2018-05-08T05:49:00+08:00","to":"2018-05-08T18:57:00+08:00"},
     * {"from":"2018-05-09T05:48:00+08:00","to":"2018-05-09T18:57:00+08:00"},
     * {"from":"2018-05-10T05:48:00+08:00","to":"2018-05-10T18:58:00+08:00"},
     * {"from":"2018-05-11T05:47:00+08:00","to":"2018-05-11T18:58:00+08:00"},
     * {"from":"2018-05-12T05:47:00+08:00","to":"2018-05-12T18:59:00+08:00"},
     * {"from":"2018-05-13T05:46:00+08:00","to":"2018-05-13T18:59:00+08:00"},
     * {"from":"2018-05-14T05:46:00+08:00","to":"2018-05-14T19:00:00+08:00"}]},
     * "temperature":{"status":0,"unit":"℃","value":[{"from":"29","to":"24"},{"from":"30",
     * "to":"24"},{"from":"30","to":"23"},{"from":"28","to":"22"},{"from":"27","to":"22"},
     * {"from":"28","to":"23"},{"from":"30","to":"22"},{"from":"31","to":"22"},{"from":"29",
     * "to":"22"},{"from":"30","to":"21"},{"from":"29","to":"20"},{"from":"30","to":"21"},
     * {"from":"30","to":"21"},{"from":"30","to":"20"},{"from":"30","to":"21"}]},
     * "weather":{"status":0,"value":[{"from":"2","to":"3"},{"from":"3","to":"1"},{"from":"4",
     * "to":"3"},{"from":"3","to":"2"},{"from":"2","to":"1"},{"from":"1","to":"1"},{"from":"1",
     * "to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7",
     * "to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7",
     * "to":"7"}]},"wind":{"direction":{"status":0,"unit":"°","value":[{"from":"180","to":"180"},
     * {"from":"360","to":"225"},{"from":"225","to":"360"},{"from":"0","to":"360"},{"from":"360",
     * "to":"360"},{"from":"135","to":"135"},{"from":"180","to":"360"},{"from":"180","to":"135"},
     * {"from":"180","to":"180"},{"from":"180","to":"135"},{"from":"135","to":"180"},
     * {"from":"180","to":"180"},{"from":"135","to":"225"},{"from":"135","to":"315"},
     * {"from":"180","to":"0"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"12.6",
     * "to":"12.6"},{"from":"0.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0",
     * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0",
     * "to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0",
     * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},
     * {"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"}]}}}
     * forecastHourly : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun",
     * "logo":"http://f5.market.mi-img
     * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
     * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]},
     * "pubTime":"2018-04-30T15:00:00+08:00","status":0,"value":[46,45,43,43,43,45,46,49,52,53,
     * 56,57,58,59,59,61,61,59,58,57,53,50,46,42,41,41,42,43,46,47,50,53,56,57,57,58,59,62,63,66,
     * 67,66,66,63,61]},"desc":"今天下午16点钟后转小雨，其后多云","status":0,
     * "temperature":{"pubTime":"2018-04-30T15:00:00+08:00","status":0,"unit":"℃","value":[29,29,
     * 28,26,25,24,24,24,24,24,24,24,24,24,24,24,25,27,28,28,29,29,30,30,30,30,30,30,29,28,27,26,
     * 25,25,24,23,23,23,23,24,24,25,26,27,28]},"weather":{"pubTime":"2018-04-30T15:00:00+08:00",
     * "status":0,"value":[1,7,7,7,7,7,7,7,2,2,2,2,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,
     * 1,1,1,1,1,1,2,2,2,2]},"wind":{"status":0,
     * "value":[{"datetime":"2018-04-30T15:00:00.000+08:00","direction":"170.59",
     * "speed":"14.35"},{"datetime":"2018-04-30T16:00:00.000+08:00","direction":"176.74",
     * "speed":"16.29"},{"datetime":"2018-04-30T17:00:00.000+08:00","direction":"180.38",
     * "speed":"17.86"},{"datetime":"2018-04-30T18:00:00.000+08:00","direction":"180.22",
     * "speed":"18.34"},{"datetime":"2018-04-30T19:00:00.000+08:00","direction":"177.73",
     * "speed":"17.98"},{"datetime":"2018-04-30T20:00:00.000+08:00","direction":"174.66",
     * "speed":"17.3"},{"datetime":"2018-04-30T21:00:00.000+08:00","direction":"172.67",
     * "speed":"16.65"},{"datetime":"2018-04-30T22:00:00.000+08:00","direction":"171.98",
     * "speed":"16.01"},{"datetime":"2018-04-30T23:00:00.000+08:00","direction":"172.32",
     * "speed":"15.31"},{"datetime":"2018-05-01T00:00:00.000+08:00","direction":"173.41",
     * "speed":"14.51"},{"datetime":"2018-05-01T01:00:00.000+08:00","direction":"174.9",
     * "speed":"13.65"},{"datetime":"2018-05-01T02:00:00.000+08:00","direction":"176.32",
     * "speed":"12.79"},{"datetime":"2018-05-01T03:00:00.000+08:00","direction":"177.21",
     * "speed":"11.98"},{"datetime":"2018-05-01T04:00:00.000+08:00","direction":"177.54",
     * "speed":"11.3"},{"datetime":"2018-05-01T05:00:00.000+08:00","direction":"177.47",
     * "speed":"10.81"},{"datetime":"2018-05-01T06:00:00.000+08:00","direction":"177.25",
     * "speed":"10.56"},{"datetime":"2018-05-01T07:00:00.000+08:00","direction":"177.43",
     * "speed":"10.54"},{"datetime":"2018-05-01T08:00:00.000+08:00","direction":"178.58",
     * "speed":"10.69"},{"datetime":"2018-05-01T09:00:00.000+08:00","direction":"180.96",
     * "speed":"11.0"},{"datetime":"2018-05-01T10:00:00.000+08:00","direction":"183.84",
     * "speed":"11.6"},{"datetime":"2018-05-01T11:00:00.000+08:00","direction":"186.26",
     * "speed":"12.62"},{"datetime":"2018-05-01T12:00:00.000+08:00","direction":"187.62",
     * "speed":"14.06"},{"datetime":"2018-05-01T13:00:00.000+08:00","direction":"188.18",
     * "speed":"15.57"},{"datetime":"2018-05-01T15:00:00.000+08:00","direction":"188.28",
     * "speed":"17.17"},{"datetime":"2018-05-01T16:00:00.000+08:00","direction":"187.52",
     * "speed":"17.09"},{"datetime":"2018-05-01T17:00:00.000+08:00","direction":"185.37",
     * "speed":"16.77"},{"datetime":"2018-05-01T18:00:00.000+08:00","direction":"181.51",
     * "speed":"16.46"},{"datetime":"2018-05-01T19:00:00.000+08:00","direction":"177.26",
     * "speed":"16.25"},{"datetime":"2018-05-01T20:00:00.000+08:00","direction":"174.4",
     * "speed":"16.05"},{"datetime":"2018-05-01T21:00:00.000+08:00","direction":"174.21",
     * "speed":"15.69"},{"datetime":"2018-05-01T22:00:00.000+08:00","direction":"176.12",
     * "speed":"15.12"},{"datetime":"2018-05-01T23:00:00.000+08:00","direction":"179.09",
     * "speed":"14.34"},{"datetime":"2018-05-02T00:00:00.000+08:00","direction":"182.2",
     * "speed":"13.33"},{"datetime":"2018-05-02T01:00:00.000+08:00","direction":"185.16",
     * "speed":"12.14"},{"datetime":"2018-05-02T02:00:00.000+08:00","direction":"187.75",
     * "speed":"10.84"},{"datetime":"2018-05-02T03:00:00.000+08:00","direction":"189.6",
     * "speed":"9.47"},{"datetime":"2018-05-02T04:00:00.000+08:00","direction":"190.32",
     * "speed":"8.24"},{"datetime":"2018-05-02T05:00:00.000+08:00","direction":"189.37",
     * "speed":"7.36"},{"datetime":"2018-05-02T06:00:00.000+08:00","direction":"186.7",
     * "speed":"6.97"},{"datetime":"2018-05-02T07:00:00.000+08:00","direction":"184.17",
     * "speed":"6.94"},{"datetime":"2018-05-02T08:00:00.000+08:00","direction":"183.91",
     * "speed":"6.97"},{"datetime":"2018-05-02T09:00:00.000+08:00","direction":"187.19",
     * "speed":"6.89"},{"datetime":"2018-05-02T10:00:00.000+08:00","direction":"192.89",
     * "speed":"6.84"},{"datetime":"2018-05-02T11:00:00.000+08:00","direction":"198.81",
     * "speed":"6.99"},{"datetime":"2018-05-02T12:00:00.000+08:00","direction":"202.99",
     * "speed":"7.38"}]}}
     * indices : {"indices":[{"type":"uvIndex","value":"5"},{"type":"humidity","value":"65"},
     * {"type":"feelsLike","value":"30.4"},{"type":"pressure","value":"1012.0"},
     * {"type":"carWash","value":"1"},{"type":"sports","value":"1"}],"pubTime":"","status":0}
     * preHour : [{"aqi":{"aqi":"46","brandInfo":{"brands":[{"brandId":"CNEMC","logo":"",
     * "names":{"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"},"url":""}]},"co":"0.8",
     * "coDesc":"一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常","no2":"33",
     * "no2Desc":"二氧化氮的主要来源是燃烧过程产生，例如供热、发电以及机动车和船舶的发动机","o3":"85",
     * "o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","pm10":"46",
     * "pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","pm25":"31",
     * "pm25Desc":"PM2.5的主要来源是燃料、木材和其他生物质燃料的燃烧","primary":"",
     * "pubTime":"2018-04-30T13:00:00+08:00","so2":"11",
     * "so2Desc":"二氧化硫影响呼吸系统和肺功能，并刺激眼睛。呼吸道的炎症导致咳嗽、粘液分泌、加重哮喘和慢性支气管炎","src":"中国环境监测总站","status":0,
     * "suggest":"空气很好，快呼吸新鲜空气，拥抱大自然吧"},"feelsLike":{"unit":"℃","value":"30.7"},
     * "humidity":{"unit":"%","value":"67"},"pressure":{"unit":"mb","value":"1013.0"},
     * "pubTime":"2018-04-30T14:00:00+08:00","temperature":{"unit":"℃","value":"29"},
     * "uvIndex":"3","visibility":{"unit":"km","value":""},"weather":"2",
     * "wind":{"direction":{"unit":"°","value":"180"},"speed":{"unit":"km/h","value":"12.2"}}}]
     * updateTime : 1525069891192
     * url : {"caiyun":"","weathercn":""}
     * yesterday : {"aqi":"","date":"2018-04-29T12:00:00+08:00","status":0,
     * "sunRise":"2018-04-29T05:55:00+08:00","sunSet":"2018-04-29T18:53:00+08:00","tempMax":"27",
     * "tempMin":"23","weatherEnd":"2","weatherStart":"3","windDircEnd":"360",
     * "windDircStart":"360","windSpeedEnd":"0.0","windSpeedStart":"0.0"}
     */

    public AqiBean aqi;
    public BrandInfoBeanX brandInfo;
    public CurrentBean current;
    public ForecastDailyBean forecastDaily;
    public ForecastHourlyBean forecastHourly;
    public IndicesBeanX indices;
    public long updateTime;
    public UrlBean url;
    public YesterdayBean yesterday;
    public List<?> alerts;
    public List<PreHourBean> preHour;

    public static class AqiBean implements Serializable{
        /**
         * aqi : 52
         * brandInfo : {"brands":[{"brandId":"CNEMC","logo":"","names":{"en_US":"CNEMC",
         * "zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"},"url":""}]}
         * co : 0.7
         * coDesc : 暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响
         * no2 : 33
         * no2Desc : 短期浓度超过200微克/立方米时，二氧化氮是一种引起呼吸道严重发炎的有毒气体
         * o3 : 67
         * o3Desc : 地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成
         * pm10 : 54
         * pm10Desc : PM10的主要来源是建筑活动和从地表扬起的尘土，含有氧化物矿物和其他成分
         * pm25 : 31
         * pm25Desc : PM2.5指的是直径小于或等于2.5微米的颗粒物，又称为细颗粒物
         * primary :
         * pubTime : 2018-04-30T13:00:00+08:00
         * so2 : 14
         * so2Desc : 人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼
         * src : 中国环境监测总站
         * status : 0
         * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
         */

        public String aqi;
        public BrandInfoBean brandInfo;
        public String co;
        public String coDesc;
        public String no2;
        public String no2Desc;
        public String o3;
        public String o3Desc;
        public String pm10;
        public String pm10Desc;
        public String pm25;
        public String pm25Desc;
        public String primary;
        public String pubTime;
        public String so2;
        public String so2Desc;
        public String src;
        public int status;
        public String suggest;

        public static class BrandInfoBean {
            public List<BrandsBean> brands;

            public static class BrandsBean {
                /**
                 * brandId : CNEMC
                 * logo :
                 * names : {"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"}
                 * url :
                 */

                public String brandId;
                public String logo;
                public NamesBean names;
                public String url;

                public static class NamesBean {
                    /**
                     * en_US : CNEMC
                     * zh_CN : 中国环境监测总站
                     * zh_TW : 中國環境監測總站
                     */

                    public String en_US;
                    public String zh_CN;
                    public String zh_TW;
                }
            }
        }
    }

    public static class BrandInfoBeanX implements Serializable{
        public List<BrandsBeanX> brands;

        public static class BrandsBeanX {
            /**
             * brandId : caiyun
             * logo : http://f5.market.mi-img
             * .com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp
             * names : {"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"}
             * url :
             */

            public String brandId;
            public String logo;
            public NamesBeanX names;
            public String url;

            public static class NamesBeanX {
                /**
                 * en_US : 彩云天气
                 * zh_CN : 彩云天气
                 * zh_TW : 彩雲天氣
                 */

                public String en_US;
                public String zh_CN;
                public String zh_TW;
            }
        }
    }

    public static class CurrentBean implements Serializable{
        /**
         * feelsLike : {"unit":"℃","value":"30.4"}
         * humidity : {"unit":"%","value":"65"}
         * pressure : {"unit":"mb","value":"1012.0"}
         * pubTime : 2018-04-30T14:04:00+08:00
         * temperature : {"unit":"℃","value":"29"}
         * uvIndex : 2
         * visibility : {"unit":"km","value":""}
         * weather : 2
         * wind : {"direction":{"unit":"°","value":"180"},"speed":{"unit":"km/h","value":"12.6"}}
         */

        public FeelsLikeBean feelsLike;
        public HumidityBean humidity;
        public PressureBean pressure;
        public String pubTime;
        public TemperatureBean temperature;
        public String uvIndex;
        public VisibilityBean visibility;
        public int weather;
        public WindBean wind;

        public static class FeelsLikeBean {
            /**
             * unit : ℃
             * value : 30.4
             */

            public String unit;
            public String value;
        }

        public static class HumidityBean {
            /**
             * unit : %
             * value : 65
             */

            public String unit;
            public String value;
        }

        public static class PressureBean {
            /**
             * unit : mb
             * value : 1012.0
             */

            public String unit;
            public String value;
        }

        public static class TemperatureBean {
            /**
             * unit : ℃
             * value : 29
             */

            public String unit;
            public int value;
        }

        public static class VisibilityBean {
            /**
             * unit : km
             * value :
             */

            public String unit;
            public String value;
        }

        public static class WindBean {
            /**
             * direction : {"unit":"°","value":"180"}
             * speed : {"unit":"km/h","value":"12.6"}
             */

            public DirectionBean direction;
            public SpeedBean speed;

            public static class DirectionBean {
                /**
                 * unit : °
                 * value : 180
                 */

                public String unit;
                public String value;
            }

            public static class SpeedBean {
                /**
                 * unit : km/h
                 * value : 12.6
                 */

                public String unit;
                public String value;
            }
        }
    }

    public static class ForecastDailyBean implements Serializable{
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img
         * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
         * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]},
         * "pubTime":"2018-04-30T00:00:00+08:00","status":0,"value":[52,51,57,31,19,43,51,47,8,7,
         * 7,16,19,38,19]}
         * precipitationProbability : {"status":0,"value":["55","59","55","55","22"]}
         * pubTime : 2018-04-30T13:00:00+08:00
         * status : 0
         * sunRiseSet : {"status":0,"value":[{"from":"2018-04-30T05:54:00+08:00",
         * "to":"2018-04-30T18:53:00+08:00"},{"from":"2018-05-01T05:53:00+08:00",
         * "to":"2018-05-01T18:54:00+08:00"},{"from":"2018-05-02T05:52:00+08:00",
         * "to":"2018-05-02T18:54:00+08:00"},{"from":"2018-05-03T05:52:00+08:00",
         * "to":"2018-05-03T18:55:00+08:00"},{"from":"2018-05-04T05:51:00+08:00",
         * "to":"2018-05-04T18:55:00+08:00"},{"from":"2018-05-05T05:51:00+08:00",
         * "to":"2018-05-05T18:56:00+08:00"},{"from":"2018-05-06T05:50:00+08:00",
         * "to":"2018-05-06T18:56:00+08:00"},{"from":"2018-05-07T05:49:00+08:00",
         * "to":"2018-05-07T18:57:00+08:00"},{"from":"2018-05-08T05:49:00+08:00",
         * "to":"2018-05-08T18:57:00+08:00"},{"from":"2018-05-09T05:48:00+08:00",
         * "to":"2018-05-09T18:57:00+08:00"},{"from":"2018-05-10T05:48:00+08:00",
         * "to":"2018-05-10T18:58:00+08:00"},{"from":"2018-05-11T05:47:00+08:00",
         * "to":"2018-05-11T18:58:00+08:00"},{"from":"2018-05-12T05:47:00+08:00",
         * "to":"2018-05-12T18:59:00+08:00"},{"from":"2018-05-13T05:46:00+08:00",
         * "to":"2018-05-13T18:59:00+08:00"},{"from":"2018-05-14T05:46:00+08:00",
         * "to":"2018-05-14T19:00:00+08:00"}]}
         * temperature : {"status":0,"unit":"℃","value":[{"from":"29","to":"24"},{"from":"30",
         * "to":"24"},{"from":"30","to":"23"},{"from":"28","to":"22"},{"from":"27","to":"22"},
         * {"from":"28","to":"23"},{"from":"30","to":"22"},{"from":"31","to":"22"},{"from":"29",
         * "to":"22"},{"from":"30","to":"21"},{"from":"29","to":"20"},{"from":"30","to":"21"},
         * {"from":"30","to":"21"},{"from":"30","to":"20"},{"from":"30","to":"21"}]}
         * weather : {"status":0,"value":[{"from":"2","to":"3"},{"from":"3","to":"1"},
         * {"from":"4","to":"3"},{"from":"3","to":"2"},{"from":"2","to":"1"},{"from":"1",
         * "to":"1"},{"from":"1","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},
         * {"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7",
         * "to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"}]}
         * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"180","to":"180"},
         * {"from":"360","to":"225"},{"from":"225","to":"360"},{"from":"0","to":"360"},
         * {"from":"360","to":"360"},{"from":"135","to":"135"},{"from":"180","to":"360"},
         * {"from":"180","to":"135"},{"from":"180","to":"180"},{"from":"180","to":"135"},
         * {"from":"135","to":"180"},{"from":"180","to":"180"},{"from":"135","to":"225"},
         * {"from":"135","to":"315"},{"from":"180","to":"0"}]},"speed":{"status":0,"unit":"km/h",
         * "value":[{"from":"12.6","to":"12.6"},{"from":"0.0","to":"20.0"},{"from":"20.0",
         * "to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"20.0",
         * "to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"0.0",
         * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0",
         * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0",
         * "to":"0.0"}]}}
         */

        public AqiBeanX aqi;
        public PrecipitationProbabilityBean precipitationProbability;
        public String pubTime;
        public int status;
        public SunRiseSetBean sunRiseSet;
        public TemperatureBeanX temperature;
        public WeatherBean weather;
        public WindBeanX wind;

        public static class AqiBeanX {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img
             * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
             * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]}
             * pubTime : 2018-04-30T00:00:00+08:00
             * status : 0
             * value : [52,51,57,31,19,43,51,47,8,7,7,16,19,38,19]
             */

            public BrandInfoBeanXX brandInfo;
            public String pubTime;
            public int status;
            public List<Integer> value;

            public static class BrandInfoBeanXX {
                public List<BrandsBeanXX> brands;

                public static class BrandsBeanXX {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img
                     * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"}
                     * url :
                     */

                    public String brandId;
                    public String logo;
                    public NamesBeanXX names;
                    public String url;

                    public static class NamesBeanXX {
                        /**
                         * en_US : 彩云天气
                         * zh_CN : 彩云天气
                         * zh_TW : 彩雲天氣
                         */

                        public String en_US;
                        public String zh_CN;
                        public String zh_TW;
                    }
                }
            }
        }

        public static class PrecipitationProbabilityBean {
            /**
             * status : 0
             * value : ["55","59","55","55","22"]
             */

            public int status;
            public List<String> value;
        }

        public static class SunRiseSetBean {
            /**
             * status : 0
             * value : [{"from":"2018-04-30T05:54:00+08:00","to":"2018-04-30T18:53:00+08:00"},
             * {"from":"2018-05-01T05:53:00+08:00","to":"2018-05-01T18:54:00+08:00"},
             * {"from":"2018-05-02T05:52:00+08:00","to":"2018-05-02T18:54:00+08:00"},
             * {"from":"2018-05-03T05:52:00+08:00","to":"2018-05-03T18:55:00+08:00"},
             * {"from":"2018-05-04T05:51:00+08:00","to":"2018-05-04T18:55:00+08:00"},
             * {"from":"2018-05-05T05:51:00+08:00","to":"2018-05-05T18:56:00+08:00"},
             * {"from":"2018-05-06T05:50:00+08:00","to":"2018-05-06T18:56:00+08:00"},
             * {"from":"2018-05-07T05:49:00+08:00","to":"2018-05-07T18:57:00+08:00"},
             * {"from":"2018-05-08T05:49:00+08:00","to":"2018-05-08T18:57:00+08:00"},
             * {"from":"2018-05-09T05:48:00+08:00","to":"2018-05-09T18:57:00+08:00"},
             * {"from":"2018-05-10T05:48:00+08:00","to":"2018-05-10T18:58:00+08:00"},
             * {"from":"2018-05-11T05:47:00+08:00","to":"2018-05-11T18:58:00+08:00"},
             * {"from":"2018-05-12T05:47:00+08:00","to":"2018-05-12T18:59:00+08:00"},
             * {"from":"2018-05-13T05:46:00+08:00","to":"2018-05-13T18:59:00+08:00"},
             * {"from":"2018-05-14T05:46:00+08:00","to":"2018-05-14T19:00:00+08:00"}]
             */

            public int status;
            public List<ValueBean> value;

            public static class ValueBean {
                /**
                 * from : 2018-04-30T05:54:00+08:00
                 * to : 2018-04-30T18:53:00+08:00
                 */

                public String from;
                public String to;
            }
        }

        public static class TemperatureBeanX {
            /**
             * status : 0
             * unit : ℃
             * value : [{"from":"29","to":"24"},{"from":"30","to":"24"},{"from":"30","to":"23"},
             * {"from":"28","to":"22"},{"from":"27","to":"22"},{"from":"28","to":"23"},
             * {"from":"30","to":"22"},{"from":"31","to":"22"},{"from":"29","to":"22"},
             * {"from":"30","to":"21"},{"from":"29","to":"20"},{"from":"30","to":"21"},
             * {"from":"30","to":"21"},{"from":"30","to":"20"},{"from":"30","to":"21"}]
             */

            public int status;
            public String unit;
            public List<ValueBeanX> value;

            public static class ValueBeanX {
                /**
                 * from : 29
                 * to : 24
                 */

                public int from;
                public int to;
            }
        }

        public static class WeatherBean {
            /**
             * status : 0
             * value : [{"from":"2","to":"3"},{"from":"3","to":"1"},{"from":"4","to":"3"},
             * {"from":"3","to":"2"},{"from":"2","to":"1"},{"from":"1","to":"1"},{"from":"1",
             * "to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},
             * {"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7","to":"7"},{"from":"7",
             * "to":"7"},{"from":"7","to":"7"}]
             */

            public int status;
            public List<ValueBeanXX> value;

            public static class ValueBeanXX {
                /**
                 * from : 2
                 * to : 3
                 */

                public int from;
                public int to;
            }
        }

        public static class WindBeanX {
            /**
             * direction : {"status":0,"unit":"°","value":[{"from":"180","to":"180"},
             * {"from":"360","to":"225"},{"from":"225","to":"360"},{"from":"0","to":"360"},
             * {"from":"360","to":"360"},{"from":"135","to":"135"},{"from":"180","to":"360"},
             * {"from":"180","to":"135"},{"from":"180","to":"180"},{"from":"180","to":"135"},
             * {"from":"135","to":"180"},{"from":"180","to":"180"},{"from":"135","to":"225"},
             * {"from":"135","to":"315"},{"from":"180","to":"0"}]}
             * speed : {"status":0,"unit":"km/h","value":[{"from":"12.6","to":"12.6"},
             * {"from":"0.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},
             * {"from":"0.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},
             * {"from":"20.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},
             * {"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},
             * {"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"}]}
             */

            public DirectionBeanX direction;
            public SpeedBeanX speed;

            public static class DirectionBeanX {
                /**
                 * status : 0
                 * unit : °
                 * value : [{"from":"180","to":"180"},{"from":"360","to":"225"},{"from":"225",
                 * "to":"360"},{"from":"0","to":"360"},{"from":"360","to":"360"},{"from":"135",
                 * "to":"135"},{"from":"180","to":"360"},{"from":"180","to":"135"},{"from":"180",
                 * "to":"180"},{"from":"180","to":"135"},{"from":"135","to":"180"},{"from":"180",
                 * "to":"180"},{"from":"135","to":"225"},{"from":"135","to":"315"},{"from":"180",
                 * "to":"0"}]
                 */

                public int status;
                public String unit;
                public List<ValueBeanXXX> value;

                public static class ValueBeanXXX {
                    /**
                     * from : 180
                     * to : 180
                     */

                    public String from;
                    public String to;
                }
            }

            public static class SpeedBeanX {
                /**
                 * status : 0
                 * unit : km/h
                 * value : [{"from":"12.6","to":"12.6"},{"from":"0.0","to":"20.0"},
                 * {"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"0.0",
                 * "to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},
                 * {"from":"20.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0",
                 * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0",
                 * "to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"}]
                 */

                public int status;
                public String unit;
                public List<ValueBeanXXXX> value;

                public static class ValueBeanXXXX {
                    /**
                     * from : 12.6
                     * to : 12.6
                     */

                    public String from;
                    public String to;
                }
            }
        }
    }

    public static class ForecastHourlyBean implements Serializable{
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img
         * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
         * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]},
         * "pubTime":"2018-04-30T15:00:00+08:00","status":0,"value":[46,45,43,43,43,45,46,49,52,
         * 53,56,57,58,59,59,61,61,59,58,57,53,50,46,42,41,41,42,43,46,47,50,53,56,57,57,58,59,
         * 62,63,66,67,66,66,63,61]}
         * desc : 今天下午16点钟后转小雨，其后多云
         * status : 0
         * temperature : {"pubTime":"2018-04-30T15:00:00+08:00","status":0,"unit":"℃",
         * "value":[29,29,28,26,25,24,24,24,24,24,24,24,24,24,24,24,25,27,28,28,29,29,30,30,30,
         * 30,30,30,29,28,27,26,25,25,24,23,23,23,23,24,24,25,26,27,28]}
         * weather : {"pubTime":"2018-04-30T15:00:00+08:00","status":0,"value":[1,7,7,7,7,7,7,7,
         * 2,2,2,2,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,2,2,2,2]}
         * wind : {"status":0,"value":[{"datetime":"2018-04-30T15:00:00.000+08:00",
         * "direction":"170.59","speed":"14.35"},{"datetime":"2018-04-30T16:00:00.000+08:00",
         * "direction":"176.74","speed":"16.29"},{"datetime":"2018-04-30T17:00:00.000+08:00",
         * "direction":"180.38","speed":"17.86"},{"datetime":"2018-04-30T18:00:00.000+08:00",
         * "direction":"180.22","speed":"18.34"},{"datetime":"2018-04-30T19:00:00.000+08:00",
         * "direction":"177.73","speed":"17.98"},{"datetime":"2018-04-30T20:00:00.000+08:00",
         * "direction":"174.66","speed":"17.3"},{"datetime":"2018-04-30T21:00:00.000+08:00",
         * "direction":"172.67","speed":"16.65"},{"datetime":"2018-04-30T22:00:00.000+08:00",
         * "direction":"171.98","speed":"16.01"},{"datetime":"2018-04-30T23:00:00.000+08:00",
         * "direction":"172.32","speed":"15.31"},{"datetime":"2018-05-01T00:00:00.000+08:00",
         * "direction":"173.41","speed":"14.51"},{"datetime":"2018-05-01T01:00:00.000+08:00",
         * "direction":"174.9","speed":"13.65"},{"datetime":"2018-05-01T02:00:00.000+08:00",
         * "direction":"176.32","speed":"12.79"},{"datetime":"2018-05-01T03:00:00.000+08:00",
         * "direction":"177.21","speed":"11.98"},{"datetime":"2018-05-01T04:00:00.000+08:00",
         * "direction":"177.54","speed":"11.3"},{"datetime":"2018-05-01T05:00:00.000+08:00",
         * "direction":"177.47","speed":"10.81"},{"datetime":"2018-05-01T06:00:00.000+08:00",
         * "direction":"177.25","speed":"10.56"},{"datetime":"2018-05-01T07:00:00.000+08:00",
         * "direction":"177.43","speed":"10.54"},{"datetime":"2018-05-01T08:00:00.000+08:00",
         * "direction":"178.58","speed":"10.69"},{"datetime":"2018-05-01T09:00:00.000+08:00",
         * "direction":"180.96","speed":"11.0"},{"datetime":"2018-05-01T10:00:00.000+08:00",
         * "direction":"183.84","speed":"11.6"},{"datetime":"2018-05-01T11:00:00.000+08:00",
         * "direction":"186.26","speed":"12.62"},{"datetime":"2018-05-01T12:00:00.000+08:00",
         * "direction":"187.62","speed":"14.06"},{"datetime":"2018-05-01T13:00:00.000+08:00",
         * "direction":"188.18","speed":"15.57"},{"datetime":"2018-05-01T15:00:00.000+08:00",
         * "direction":"188.28","speed":"17.17"},{"datetime":"2018-05-01T16:00:00.000+08:00",
         * "direction":"187.52","speed":"17.09"},{"datetime":"2018-05-01T17:00:00.000+08:00",
         * "direction":"185.37","speed":"16.77"},{"datetime":"2018-05-01T18:00:00.000+08:00",
         * "direction":"181.51","speed":"16.46"},{"datetime":"2018-05-01T19:00:00.000+08:00",
         * "direction":"177.26","speed":"16.25"},{"datetime":"2018-05-01T20:00:00.000+08:00",
         * "direction":"174.4","speed":"16.05"},{"datetime":"2018-05-01T21:00:00.000+08:00",
         * "direction":"174.21","speed":"15.69"},{"datetime":"2018-05-01T22:00:00.000+08:00",
         * "direction":"176.12","speed":"15.12"},{"datetime":"2018-05-01T23:00:00.000+08:00",
         * "direction":"179.09","speed":"14.34"},{"datetime":"2018-05-02T00:00:00.000+08:00",
         * "direction":"182.2","speed":"13.33"},{"datetime":"2018-05-02T01:00:00.000+08:00",
         * "direction":"185.16","speed":"12.14"},{"datetime":"2018-05-02T02:00:00.000+08:00",
         * "direction":"187.75","speed":"10.84"},{"datetime":"2018-05-02T03:00:00.000+08:00",
         * "direction":"189.6","speed":"9.47"},{"datetime":"2018-05-02T04:00:00.000+08:00",
         * "direction":"190.32","speed":"8.24"},{"datetime":"2018-05-02T05:00:00.000+08:00",
         * "direction":"189.37","speed":"7.36"},{"datetime":"2018-05-02T06:00:00.000+08:00",
         * "direction":"186.7","speed":"6.97"},{"datetime":"2018-05-02T07:00:00.000+08:00",
         * "direction":"184.17","speed":"6.94"},{"datetime":"2018-05-02T08:00:00.000+08:00",
         * "direction":"183.91","speed":"6.97"},{"datetime":"2018-05-02T09:00:00.000+08:00",
         * "direction":"187.19","speed":"6.89"},{"datetime":"2018-05-02T10:00:00.000+08:00",
         * "direction":"192.89","speed":"6.84"},{"datetime":"2018-05-02T11:00:00.000+08:00",
         * "direction":"198.81","speed":"6.99"},{"datetime":"2018-05-02T12:00:00.000+08:00",
         * "direction":"202.99","speed":"7.38"}]}
         */

        public AqiBeanXX aqi;
        public String desc;
        public int status;
        public TemperatureBeanXX temperature;
        public WeatherBeanX weather;
        public WindBeanXX wind;

        public static class AqiBeanXX {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img
             * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp",
             * "names":{"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"},"url":""}]}
             * pubTime : 2018-04-30T15:00:00+08:00
             * status : 0
             * value : [46,45,43,43,43,45,46,49,52,53,56,57,58,59,59,61,61,59,58,57,53,50,46,42,
             * 41,41,42,43,46,47,50,53,56,57,57,58,59,62,63,66,67,66,66,63,61]
             */

            public BrandInfoBeanXXX brandInfo;
            public String pubTime;
            public int status;
            public List<Integer> value;

            public static class BrandInfoBeanXXX {
                public List<BrandsBeanXXX> brands;

                public static class BrandsBeanXXX {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img
                     * .com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_CN":"彩云天气","zh_TW":"彩雲天氣"}
                     * url :
                     */

                    public String brandId;
                    public String logo;
                    public NamesBeanXXX names;
                    public String url;

                    public static class NamesBeanXXX {
                        /**
                         * en_US : 彩云天气
                         * zh_CN : 彩云天气
                         * zh_TW : 彩雲天氣
                         */

                        public String en_US;
                        public String zh_CN;
                        public String zh_TW;
                    }
                }
            }
        }

        public static class TemperatureBeanXX {
            /**
             * pubTime : 2018-04-30T15:00:00+08:00
             * status : 0
             * unit : ℃
             * value : [29,29,28,26,25,24,24,24,24,24,24,24,24,24,24,24,25,27,28,28,29,29,30,30,
             * 30,30,30,30,29,28,27,26,25,25,24,23,23,23,23,24,24,25,26,27,28]
             */

            public String pubTime;
            public int status;
            public String unit;
            public List<Integer> value;
        }

        public static class WeatherBeanX {
            /**
             * pubTime : 2018-04-30T15:00:00+08:00
             * status : 0
             * value : [1,7,7,7,7,7,7,7,2,2,2,2,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,
             * 1,1,1,1,1,2,2,2,2]
             */

            public String pubTime;
            public int status;
            public List<Integer> value;
        }

        public static class WindBeanXX {
            /**
             * status : 0
             * value : [{"datetime":"2018-04-30T15:00:00.000+08:00","direction":"170.59",
             * "speed":"14.35"},{"datetime":"2018-04-30T16:00:00.000+08:00","direction":"176.74",
             * "speed":"16.29"},{"datetime":"2018-04-30T17:00:00.000+08:00","direction":"180.38",
             * "speed":"17.86"},{"datetime":"2018-04-30T18:00:00.000+08:00","direction":"180.22",
             * "speed":"18.34"},{"datetime":"2018-04-30T19:00:00.000+08:00","direction":"177.73",
             * "speed":"17.98"},{"datetime":"2018-04-30T20:00:00.000+08:00","direction":"174.66",
             * "speed":"17.3"},{"datetime":"2018-04-30T21:00:00.000+08:00","direction":"172.67",
             * "speed":"16.65"},{"datetime":"2018-04-30T22:00:00.000+08:00","direction":"171.98",
             * "speed":"16.01"},{"datetime":"2018-04-30T23:00:00.000+08:00","direction":"172.32",
             * "speed":"15.31"},{"datetime":"2018-05-01T00:00:00.000+08:00","direction":"173.41","speed":"14.51"},{"datetime":"2018-05-01T01:00:00.000+08:00","direction":"174.9","speed":"13.65"},{"datetime":"2018-05-01T02:00:00.000+08:00","direction":"176.32","speed":"12.79"},{"datetime":"2018-05-01T03:00:00.000+08:00","direction":"177.21","speed":"11.98"},{"datetime":"2018-05-01T04:00:00.000+08:00","direction":"177.54","speed":"11.3"},{"datetime":"2018-05-01T05:00:00.000+08:00","direction":"177.47","speed":"10.81"},{"datetime":"2018-05-01T06:00:00.000+08:00","direction":"177.25","speed":"10.56"},{"datetime":"2018-05-01T07:00:00.000+08:00","direction":"177.43","speed":"10.54"},{"datetime":"2018-05-01T08:00:00.000+08:00","direction":"178.58","speed":"10.69"},{"datetime":"2018-05-01T09:00:00.000+08:00","direction":"180.96","speed":"11.0"},{"datetime":"2018-05-01T10:00:00.000+08:00","direction":"183.84","speed":"11.6"},{"datetime":"2018-05-01T11:00:00.000+08:00","direction":"186.26","speed":"12.62"},{"datetime":"2018-05-01T12:00:00.000+08:00","direction":"187.62","speed":"14.06"},{"datetime":"2018-05-01T13:00:00.000+08:00","direction":"188.18","speed":"15.57"},{"datetime":"2018-05-01T15:00:00.000+08:00","direction":"188.28","speed":"17.17"},{"datetime":"2018-05-01T16:00:00.000+08:00","direction":"187.52","speed":"17.09"},{"datetime":"2018-05-01T17:00:00.000+08:00","direction":"185.37","speed":"16.77"},{"datetime":"2018-05-01T18:00:00.000+08:00","direction":"181.51","speed":"16.46"},{"datetime":"2018-05-01T19:00:00.000+08:00","direction":"177.26","speed":"16.25"},{"datetime":"2018-05-01T20:00:00.000+08:00","direction":"174.4","speed":"16.05"},{"datetime":"2018-05-01T21:00:00.000+08:00","direction":"174.21","speed":"15.69"},{"datetime":"2018-05-01T22:00:00.000+08:00","direction":"176.12","speed":"15.12"},{"datetime":"2018-05-01T23:00:00.000+08:00","direction":"179.09","speed":"14.34"},{"datetime":"2018-05-02T00:00:00.000+08:00","direction":"182.2","speed":"13.33"},{"datetime":"2018-05-02T01:00:00.000+08:00","direction":"185.16","speed":"12.14"},{"datetime":"2018-05-02T02:00:00.000+08:00","direction":"187.75","speed":"10.84"},{"datetime":"2018-05-02T03:00:00.000+08:00","direction":"189.6","speed":"9.47"},{"datetime":"2018-05-02T04:00:00.000+08:00","direction":"190.32","speed":"8.24"},{"datetime":"2018-05-02T05:00:00.000+08:00","direction":"189.37","speed":"7.36"},{"datetime":"2018-05-02T06:00:00.000+08:00","direction":"186.7","speed":"6.97"},{"datetime":"2018-05-02T07:00:00.000+08:00","direction":"184.17","speed":"6.94"},{"datetime":"2018-05-02T08:00:00.000+08:00","direction":"183.91","speed":"6.97"},{"datetime":"2018-05-02T09:00:00.000+08:00","direction":"187.19","speed":"6.89"},{"datetime":"2018-05-02T10:00:00.000+08:00","direction":"192.89","speed":"6.84"},{"datetime":"2018-05-02T11:00:00.000+08:00","direction":"198.81","speed":"6.99"},{"datetime":"2018-05-02T12:00:00.000+08:00","direction":"202.99","speed":"7.38"}]
             */

            public int status;
            public List<ValueBeanXXXXX> value;

            public static class ValueBeanXXXXX {
                /**
                 * datetime : 2018-04-30T15:00:00.000+08:00
                 * direction : 170.59
                 * speed : 14.35
                 */

                public String datetime;
                public String direction;
                public String speed;
            }
        }
    }

    public static class IndicesBeanX {
        /**
         * indices : [{"type":"uvIndex","value":"5"},{"type":"humidity","value":"65"},{"type":"feelsLike","value":"30.4"},{"type":"pressure","value":"1012.0"},{"type":"carWash","value":"1"},{"type":"sports","value":"1"}]
         * pubTime :
         * status : 0
         */

        public String pubTime;
        public int status;
        public List<IndicesBean> indices;

        public static class IndicesBean {
            /**
             * type : uvIndex
             * value : 5
             */

            public String type;
            public String value;
        }
    }

    public static class UrlBean implements Serializable{
        /**
         * caiyun :
         * weathercn :
         */

        public String caiyun;
        public String weathercn;
    }

    public static class YesterdayBean implements Serializable{
        /**
         * aqi :
         * date : 2018-04-29T12:00:00+08:00
         * status : 0
         * sunRise : 2018-04-29T05:55:00+08:00
         * sunSet : 2018-04-29T18:53:00+08:00
         * tempMax : 27
         * tempMin : 23
         * weatherEnd : 2
         * weatherStart : 3
         * windDircEnd : 360
         * windDircStart : 360
         * windSpeedEnd : 0.0
         * windSpeedStart : 0.0
         */

        public String aqi;
        public String date;
        public int status;
        public String sunRise;
        public String sunSet;
        public String tempMax;
        public String tempMin;
        public String weatherEnd;
        public String weatherStart;
        public String windDircEnd;
        public String windDircStart;
        public String windSpeedEnd;
        public String windSpeedStart;
    }

    public static class PreHourBean implements Serializable{
        /**
         * aqi : {"aqi":"46","brandInfo":{"brands":[{"brandId":"CNEMC","logo":"","names":{"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"},"url":""}]},"co":"0.8","coDesc":"一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常","no2":"33","no2Desc":"二氧化氮的主要来源是燃烧过程产生，例如供热、发电以及机动车和船舶的发动机","o3":"85","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","pm10":"46","pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","pm25":"31","pm25Desc":"PM2.5的主要来源是燃料、木材和其他生物质燃料的燃烧","primary":"","pubTime":"2018-04-30T13:00:00+08:00","so2":"11","so2Desc":"二氧化硫影响呼吸系统和肺功能，并刺激眼睛。呼吸道的炎症导致咳嗽、粘液分泌、加重哮喘和慢性支气管炎","src":"中国环境监测总站","status":0,"suggest":"空气很好，快呼吸新鲜空气，拥抱大自然吧"}
         * feelsLike : {"unit":"℃","value":"30.7"}
         * humidity : {"unit":"%","value":"67"}
         * pressure : {"unit":"mb","value":"1013.0"}
         * pubTime : 2018-04-30T14:00:00+08:00
         * temperature : {"unit":"℃","value":"29"}
         * uvIndex : 3
         * visibility : {"unit":"km","value":""}
         * weather : 2
         * wind : {"direction":{"unit":"°","value":"180"},"speed":{"unit":"km/h","value":"12.2"}}
         */

        public AqiBeanXXX aqi;
        public FeelsLikeBeanX feelsLike;
        public HumidityBeanX humidity;
        public PressureBeanX pressure;
        public String pubTime;
        public TemperatureBeanXXX temperature;
        public String uvIndex;
        public VisibilityBeanX visibility;
        public String weather;
        public WindBeanXXX wind;

        public static class AqiBeanXXX {
            /**
             * aqi : 46
             * brandInfo : {"brands":[{"brandId":"CNEMC","logo":"","names":{"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"},"url":""}]}
             * co : 0.8
             * coDesc : 一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常
             * no2 : 33
             * no2Desc : 二氧化氮的主要来源是燃烧过程产生，例如供热、发电以及机动车和船舶的发动机
             * o3 : 85
             * o3Desc : 地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成
             * pm10 : 46
             * pm10Desc : PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物
             * pm25 : 31
             * pm25Desc : PM2.5的主要来源是燃料、木材和其他生物质燃料的燃烧
             * primary :
             * pubTime : 2018-04-30T13:00:00+08:00
             * so2 : 11
             * so2Desc : 二氧化硫影响呼吸系统和肺功能，并刺激眼睛。呼吸道的炎症导致咳嗽、粘液分泌、加重哮喘和慢性支气管炎
             * src : 中国环境监测总站
             * status : 0
             * suggest : 空气很好，快呼吸新鲜空气，拥抱大自然吧
             */

            public String aqi;
            public BrandInfoBeanXXXX brandInfo;
            public String co;
            public String coDesc;
            public String no2;
            public String no2Desc;
            public String o3;
            public String o3Desc;
            public String pm10;
            public String pm10Desc;
            public String pm25;
            public String pm25Desc;
            public String primary;
            public String pubTime;
            public String so2;
            public String so2Desc;
            public String src;
            public int status;
            public String suggest;

            public static class BrandInfoBeanXXXX {
                public List<BrandsBeanXXXX> brands;

                public static class BrandsBeanXXXX {
                    /**
                     * brandId : CNEMC
                     * logo :
                     * names : {"en_US":"CNEMC","zh_CN":"中国环境监测总站","zh_TW":"中國環境監測總站"}
                     * url :
                     */

                    public String brandId;
                    public String logo;
                    public NamesBeanXXXX names;
                    public String url;

                    public static class NamesBeanXXXX {
                        /**
                         * en_US : CNEMC
                         * zh_CN : 中国环境监测总站
                         * zh_TW : 中國環境監測總站
                         */

                        public String en_US;
                        public String zh_CN;
                        public String zh_TW;
                    }
                }
            }
        }

        public static class FeelsLikeBeanX {
            /**
             * unit : ℃
             * value : 30.7
             */

            public String unit;
            public String value;
        }

        public static class HumidityBeanX {
            /**
             * unit : %
             * value : 67
             */

            public String unit;
            public String value;
        }

        public static class PressureBeanX {
            /**
             * unit : mb
             * value : 1013.0
             */

            public String unit;
            public String value;
        }

        public static class TemperatureBeanXXX {
            /**
             * unit : ℃
             * value : 29
             */

            public String unit;
            public String value;
        }

        public static class VisibilityBeanX {
            /**
             * unit : km
             * value :
             */

            public String unit;
            public String value;
        }

        public static class WindBeanXXX {
            /**
             * direction : {"unit":"°","value":"180"}
             * speed : {"unit":"km/h","value":"12.2"}
             */

            public DirectionBeanXX direction;
            public SpeedBeanXX speed;

            public static class DirectionBeanXX {
                /**
                 * unit : °
                 * value : 180
                 */

                public String unit;
                public String value;
            }

            public static class SpeedBeanXX {
                /**
                 * unit : km/h
                 * value : 12.2
                 */

                public String unit;
                public String value;
            }
        }
    }
}
