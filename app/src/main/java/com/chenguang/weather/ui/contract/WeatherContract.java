package com.chenguang.weather.ui.contract;

import com.chenguang.weather.base.BaseContract;
import com.chenguang.weather.bean.AdviseTitleBean;
import com.chenguang.weather.bean.HeaderBean;
import com.chenguang.weather.bean.HoursForecastBean;
import com.chenguang.weather.bean.OutLookWeather;
import com.chenguang.weather.bean.VideoBean;

import java.util.List;

/**
 * Created by hcg on 2018/5/12.
 */

public interface WeatherContract extends BaseContract {
    interface View extends BaseView {
        void showHeaderData(HeaderBean headerBean);

        void showOutLookWeathers(List<OutLookWeather> outLookWeathers);

        void showHoursWeather(HoursForecastBean hoursForecastBean);

        void showVideo(VideoBean videoBean);

        void showAdviseTitleBean(List<AdviseTitleBean> adviseTitleBeans);

        void finish();
    }

    interface Presenter<T extends BaseView> extends BasePresenter<T> {
        void getWeatherForecast(String lat, String lon);

        void getAdviseData(String lat, String lon);
    }
}
