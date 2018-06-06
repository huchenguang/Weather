package com.chenguang.weather.ui.presenter;

import android.annotation.SuppressLint;
import android.util.Log;

import com.chenguang.weather.api.ConstantValues;
import com.chenguang.weather.api.DefaultErrorConsumer;
import com.chenguang.weather.api.DefaultListErrorConsumer;
import com.chenguang.weather.api.WeatherApi;
import com.chenguang.weather.base.RxPresenter;
import com.chenguang.weather.bean.AdviseBean;
import com.chenguang.weather.bean.AdviseTitleBean;
import com.chenguang.weather.bean.HeaderBean;
import com.chenguang.weather.bean.HoursForecastBean;
import com.chenguang.weather.bean.OutLookWeather;
import com.chenguang.weather.bean.RainForecastBean;
import com.chenguang.weather.bean.VideoBean;
import com.chenguang.weather.bean.WeatherBean;
import com.chenguang.weather.bean.WeatherForecast;
import com.chenguang.weather.bean.WeatherForecastBean2;
import com.chenguang.weather.ui.contract.WeatherContract;
import com.chenguang.weather.ui.fragment.WeatherFragment;
import com.chenguang.weather.utils.DateUtils;
import com.chenguang.weather.utils.RxUtils;
import com.chenguang.weather.utils.ToastUtils;
import com.chenguang.weather.utils.WeatherUtils;
import com.google.gson.Gson;

import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by hcg on 2018/5/12.
 */

public class WeatherForecastPresenter extends RxPresenter<WeatherFragment> implements
        WeatherContract.Presenter<WeatherFragment> {
    @SuppressLint("CheckResult")
    @Override
    public void getWeatherForecast(final String lat, final String lon) {
        Observable.zip(WeatherApi.getInstance().getWeatherForecastFromWanLi(lat, lon)
                , WeatherApi.getInstance().getWeatherForecast(lat, lon)
                , WeatherApi.getInstance().getRainForecastBean(lat, lon)
                , (weatherForecastBean2, weatherForecastBean, rainForecastBean) -> {
                    WeatherForecast weatherForecast = new WeatherForecast();
                    weatherForecast.weather1 = weatherForecastBean;
                    weatherForecast.weather2 = weatherForecastBean2;
                    weatherForecast.rainForecast = rainForecastBean;
                    return weatherForecast;
                })
                .compose(RxUtils.switchSchedulers())
                .subscribe(weatherForecast -> {
                    //未来24小时天气
                    HoursForecastBean hoursForecastBean = new HoursForecastBean();
                    hoursForecastBean.title = weatherForecast.weather1.forecastHourly.desc;
                    hoursForecastBean.list = new ArrayList<>();
                    try {
                        int size = Math.min(weatherForecast.weather2.hourfc.size(),
                                weatherForecast.weather1.forecastHourly.weather.value.size());
                        for (int i = 0; i < size - 1; i++) {
                            WeatherForecastBean2.HourfcBean hourfcBean = weatherForecast
                                    .weather2.hourfc.get(i);
                            WeatherBean weatherBean = new WeatherBean();
                            weatherBean.temperature = hourfcBean.wthr;
                            String time = hourfcBean.time.substring(hourfcBean.time.length()
                                    - 4, hourfcBean.time.length());
                            if (i == 1) {
                                weatherBean.time = "现在";
                            } else {
                                weatherBean.time = time.substring(0, 2) + ":" + time
                                        .substring(2, 4);
                            }
                            weatherBean.temperatureStr = weatherBean.temperature + "°";

                            weatherBean.weatherType = hourfcBean.type;
                            //当前天气
                            weatherBean.weather = WeatherUtils.getWeatherStatus(weatherForecast
                                    .weather1.forecastHourly.weather.value.get(i));

                            hoursForecastBean.list.add(weatherBean);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    mView.showHoursWeather(hoursForecastBean);
                    /**
                     *  未来14天天气+昨天
                     */
                    List<OutLookWeather> outLookWeathers = new ArrayList<>();
                    WeatherForecastBean2.Forecast15Bean forecast15Bean;
                    Calendar calendar2 = DateUtils.getCalendar(weatherForecast
                            .weather1.forecastDaily.pubTime);
                    calendar2.add(Calendar.DATE, -1);
                    int size2 = Math.min(weatherForecast.weather2.forecast15.size() - 1,
                            weatherForecast.weather1.forecastDaily.weather.value.size());
                    for (int i = 0; i < size2; i++) {
                        forecast15Bean = weatherForecast.weather2.forecast15.get(i);
                        OutLookWeather outLookWeather = new OutLookWeather();
                        outLookWeather.highTemperature = forecast15Bean.high;
                        outLookWeather.lowTemperature = forecast15Bean.low;
                        outLookWeather.airQuality = WeatherUtils.getAqi
                                (forecast15Bean.aqi);
                        outLookWeather.wind = forecast15Bean.night.wd;
                        outLookWeather.windLevel = forecast15Bean.night.wp;
                        //时间相关
                        final SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd");
                        if (i == 0) {
                            outLookWeather.week = "昨天";
                        } else if (i == 1) {
                            outLookWeather.week = "今天";
                        } else if (i == 2) {
                            outLookWeather.week = "明天";
                        } else {
                            outLookWeather.week = WeatherUtils.getWeek(calendar2.get(Calendar
                                    .DAY_OF_WEEK));
                        }
                        outLookWeather.date = sdf1.format(calendar2.getTime());
                        outLookWeather.weatherDay = WeatherUtils.getWeatherStatus
                                (weatherForecast.weather1.forecastDaily.weather.value.get(i)
                                        .from);
                        outLookWeather.weatherNight = WeatherUtils.getWeatherStatus
                                (weatherForecast.weather1.forecastDaily.weather.value.get(i)
                                        .to);
                        calendar2.add(Calendar.DATE, 1);
                        outLookWeathers.add(outLookWeather);
                    }
                    mView.showOutLookWeathers(outLookWeathers);
                    /**
                     * 头部数据
                     */
                    HeaderBean headerBean = new HeaderBean();
                    headerBean.weather = WeatherUtils.getWeatherStatus(weatherForecast
                            .weather1.current.weather);
                    headerBean.currTemp = weatherForecast.weather1.current.temperature.value;
                    headerBean.aqi = Integer.parseInt(weatherForecast.weather1.aqi.aqi);
                    headerBean.aqiStr = WeatherUtils.getAqi(headerBean.aqi);
                    headerBean.hourForecast = weatherForecast.rainForecast.precipitation
                            .headDescription;
                    mView.showHeaderData(headerBean);
                }, new DefaultErrorConsumer());
    }

    @SuppressLint("CheckResult")
    @Override
    public void getAdviseData(String lat, String lon) {
        WeatherApi.getInstance()
                .getAdviseData(lat, lon)
                .compose(RxUtils.switchSchedulers())
                .subscribe(adviseBean -> {
                    /**
                     * 获取视频相关数据
                     */
                    VideoBean videoBean = new VideoBean();
                    videoBean.title = adviseBean.cards.get(0).list.get(0).data.wtrSummary;
                    videoBean.imgUrl = adviseBean.cards.get(0).list.get(0).data.wtrImges
                            .get(0);
                    String url = adviseBean.cards.get(0).list.get(0).data.wtrLink.url;
                    url = URLDecoder.decode(url);
                    videoBean.videoUrl = ConstantValues.VIDEO_BASE_URL + url.substring(url
                            .indexOf("vid=") + "vid=".length(), url.length());
                    mView.showVideo(videoBean);
                    /**
                     * 获取建议
                     */
                    List<AdviseTitleBean> adviseTitleBeans = new ArrayList<>();
                    for (AdviseBean.CardsBean.ListBean listBean : adviseBean.cards.get(1)
                            .list) {
                        AdviseTitleBean adviseTitleBean = new AdviseTitleBean();
                        adviseTitleBean.imgUrl = listBean.data.wtrHeadData.iconImgUrl;
                        adviseTitleBean.title = listBean.data.wtrHeadData.title;
                        adviseTitleBean.headerImgUrl = listBean.data.wtrHeadData.imgUrl;
                        adviseTitleBean.headerSummary = listBean.data.wtrHeadData.summary;
                        adviseTitleBean.channelId = listBean.data.wtrLink.channelId;
                        adviseTitleBean.contentUrl = listBean.data.wtrHeadData.imgUrl;
                        adviseTitleBeans.add(adviseTitleBean);
                    }
                    mView.showAdviseTitleBean(adviseTitleBeans);
                }, new DefaultListErrorConsumer() {
                    @Override
                    public void error() {
                        mView.finish();
                    }
                }, () -> mView.finish());
    }
}
