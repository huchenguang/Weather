package com.chenguang.weather.api;

import com.chenguang.weather.bean.AdviseBean;
import com.chenguang.weather.bean.AdviseDetailBean;
import com.chenguang.weather.bean.City;
import com.chenguang.weather.bean.City2;
import com.chenguang.weather.bean.RainForecastBean;
import com.chenguang.weather.bean.WeatherForecastBean;
import com.chenguang.weather.bean.WeatherForecastBean2;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.convert.StringConvert;
import com.lzy.okgo.model.Response;
import com.lzy.okrx2.adapter.ObservableResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * Created by hcg on 2018/5/2.
 */

public class WeatherApi {
    private static WeatherApi instance = null;

    public WeatherApi() {
    }

    public static WeatherApi getInstance() {
        if (instance == null) {
            synchronized (WeatherApi.class) {
                if (instance == null) {
                    instance = new WeatherApi();
                }
            }
        }
        return instance;
    }

    public Observable<WeatherForecastBean> getWeatherForecast(String lat, String lon) {
        //latitude=23.17538&longitude=113.500994&
        /*String lat = "23.17538";
        String lon = "113.500994";*/
        return OkGo.<String>get(ConstantValues.WHETHER_FORECAST_URL)
                .cacheKey("weather" + lat + "_" + lon)
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                .params("latitude", lat)
                .params("longitude", lon)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap((Function<Response<String>, ObservableSource<WeatherForecastBean>>)
                        stringResponse -> {
                            WeatherForecastBean weatherForecastBean = new Gson().fromJson
                                    (stringResponse.body(), WeatherForecastBean.class);
                            return Observable.just(weatherForecastBean);
                        });
    }

    public Observable<WeatherForecastBean2> getWeatherForecastFromWanLi(String lat, String lon) {
        return getCityId(lat, lon)
                .flatMap((Function<City2, ObservableSource<WeatherForecastBean2>>) city2 -> OkGo
                        .<String>get(ConstantValues.WHETHER_FORECAST_URL2)
                        .params("citykey", city2.data.get(0).cityid)
                        .cacheKey("weather_wanli" + lat + "_" + lon)
                        .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                        .converter(new StringConvert())
                        .adapt(new ObservableResponse<String>())
                        .flatMap((Function<Response<String>,
                                ObservableSource<WeatherForecastBean2>>) stringResponse -> {
                            WeatherForecastBean2 weatherForecastBean = new Gson()
                                    .fromJson(stringResponse.body(), WeatherForecastBean2.class);
                            return Observable.just(weatherForecastBean);
                        }));
    }

    public Observable<AdviseBean> getAdviseData(String lat, String lon) {
        //&latitude=23.17538&longitude=113.500994
        /*String lat = "23.17538";
        String lon = "113.500994";*/
        return OkGo.<String>get(ConstantValues.WHETHER_ADVISE_URL)
                .params("latitude", lat)
                .params("longitude", lon)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap((Function<Response<String>, ObservableSource<AdviseBean>>)
                        stringResponse -> {
                            AdviseBean bean = new Gson()
                                    .fromJson(stringResponse.body(), AdviseBean.class);
                            return Observable.just(bean);
                        });
    }

    public Observable<RainForecastBean> getRainForecastBean(String lat, String lon) {
        //latitude=23.17538&longitude=113.500994&
       /* String lat = "23.17538";
        String lon = "113.500994";*/
        return OkGo.<String>get(ConstantValues.CURR_WHETHER_URL)
                .params("latitude", lat)
                .params("longitude", lon)
                .cacheKey("rain_forecast" + lat + "_" + lon)
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap((Function<Response<String>, ObservableSource<RainForecastBean>>)
                        stringResponse -> {
                            RainForecastBean weatherForecastBean = new Gson().fromJson
                                    (stringResponse.body(), RainForecastBean.class);
                            return Observable.just(weatherForecastBean);
                        });
    }

    public String getRainForecastBeanSyn(String lat, String lon) throws IOException {
        //latitude=23.17538&longitude=113.500994&
        /*String lat = "23.17538";
        String lon = "113.500994";*/
        return OkGo.<String>get(ConstantValues.CURR_WHETHER_URL)
                .params("latitude", lat)
                .params("longitude", lon)
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                .converter(new StringConvert())
                .execute().body().string();
    }

    //&lat=23.177731&lon=113.504435
    public Observable<City2> getCityId(String lat, String lon) {
        //&latitude=23.17538&longitude=113.500994
       /* String lat = "23.17538";
        String lon = "113.500994";*/
        return OkGo.<String>get(ConstantValues.CITY_ID_URL)
                .params("lat", lat)
                .params("lon", lon)
                .cacheKey("cityId_" + lat + "_" + lon)
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap((Function<Response<String>, ObservableSource<City2>>) stringResponse -> {
                    City2 bean = new Gson().fromJson
                            (stringResponse.body(), City2.class);
                    return Observable.just(bean);
                });
    }

    public Observable<List<City>> getHotCities() {
        return OkGo.<String>get(ConstantValues.HOT_CITIES)
                .converter(new StringConvert())
                .cacheKey("hot_city")
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
                .adapt(new ObservableResponse<String>())
                .flatMap((Function<Response<String>, ObservableSource<List<City>>>)
                        stringResponse -> {
                            List<City> cities = new Gson()
                                    .fromJson(stringResponse.body()
                                            , new TypeToken<List<City>>() {
                                            }.getType());
                            return Observable.just(cities);
                        });
    }

    /*
    https://weatherapi.market.xiaomi
    .com/wtr-v3/location/city/search?name=太康&appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07
    &romVersion=8.3.26&appVersion=9050702&alpha=false&isGlobal=false&device=gemini&modDevice
    =&locale=zh_cn
     */
    public Observable<List<City>> searchCity(String name) {
        return OkGo.<String>get(ConstantValues.SEARCH_CITY)
                .params("name", name)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap(new Function<Response<String>, ObservableSource<List<City>>>() {
                    @Override
                    public ObservableSource<List<City>> apply(Response<String>
                                                                      stringResponse)
                            throws Exception {
                        List<City> cities = new Gson().fromJson(stringResponse.body(), new
                                TypeToken<List<City>>() {
                                }.getType());
                        return Observable.just(cities);
                    }
                });
    }

    public Observable<AdviseDetailBean> getAdviseDetail(String channelId) {
        return OkGo.<String>get(ConstantValues.ADVISE_DETAIL)
                .params("channelId", channelId)
                .converter(new StringConvert())
                .adapt(new ObservableResponse<String>())
                .flatMap(new Function<Response<String>, ObservableSource<AdviseDetailBean>>() {
                    @Override
                    public ObservableSource<AdviseDetailBean> apply(Response<String>
                                                                            stringResponse)
                            throws Exception {
                        AdviseDetailBean adviseDetailBean = new Gson().fromJson(stringResponse
                                        .body(),
                                AdviseDetailBean.class);
                        return Observable.just(adviseDetailBean);
                    }
                });
    }
}
