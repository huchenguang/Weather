package com.chenguang.weather.api;

import java.net.URL;

/**
 * Created by hcg on 2018/4/5.
 */

public class ConstantValues {
    public static final String WHETHER_FORECAST_URL = "https://weatherapi.market.xiaomi" +
            ".com/wtr-v3/weather/all?isLocated=true&days=15&appKey=weather20151024&isGlobal=false" +
            "&locale=zh_cn&sign=zUFJoAR2ZVrDy1vF3D07";
    public static final String WHETHER_FORECAST_URL2 = "http://zhwnlapi.etouch" +
            ".cn/Ecalender/api/v2/weather";
    public static final String CURR_WHETHER_URL = "https://weatherapi.market.xiaomi" +
            ".com/wtr-v3/weather/xm/forecast/minutely?locale=zh_cn&isGlobal=false&appKey" +
            "=weather20151024&locationKey=weathercn%3A101280101&sign=zUFJoAR2ZVrDy1vF3D07";

    public static final String CITY_ID_URL = "http://zhwnlapi.etouch" +
            ".cn/Ecalender/api/city?type=gps&app_ts=1526114903262&app_key=99817749";
    public static final String HOT_CITIES = "https://weatherapi.market.xiaomi" +
            ".com/wtr-v3/location/city/hots?locale=zh_cn&appKey=weather20151024&sign" +
            "=zUFJoAR2ZVrDy1vF3D07";
    public static final String SEARCH_CITY = "https://weatherapi.market.xiaomi" +
            ".com/wtr-v3/location/city/search?appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07" +
            "&romVersion=8.3.26&appVersion=9050702&alpha=false&isGlobal=false&device=gemini" +
            "&modDevice=&locale=zh_cn";

    public static final String WHETHER_ADVISE_URL = "https://wtradv.market.xiaomi" +
            ".com/v1/page?sysVersion=development&appVersion=9050702&channelId=1050&imei" +
            "=6d452a0f7475c1c92131e8efed53b4e4&locationKey=weathercn%3A101280101&country=CN" +
            "&language=zh&network=WIFI&screenWidth=1080&screenHeight=1920&miuiVersion=V9&device" +
            "=gemini&dislike=&model=MI+5&androidVersion=24&screenDensity=3.0";
    public static final String ADVISE_DETAIL = "https://wtradv.market.xiaomi" +
            ".com/v1/page?sysVersion=development&appVersion=9050702&imei" +
            "=6d452a0f7475c1c92131e8efed53b4e4&locationKey=weathercn%3A101181403&country=CN" +
            "&language=zh&network=WIFI&screenWidth=1080&screenHeight=1920&miuiVersion=V9&device" +
            "=gemini&dislike=&model=MI+5&androidVersion=24&screenDensity=3.0";


    public static final String VIDEO_BASE_URL = "http://dl.w.xk.miui.com/";

    public static final String SP_FILE_NAME = "weatherInfo";
    public static final String LOCATE_FAILED = "定位失败";
}
