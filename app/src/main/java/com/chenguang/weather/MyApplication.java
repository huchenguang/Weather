package com.chenguang.weather;

import android.app.Application;

import com.chenguang.weather.bean.City;
import com.chenguang.weather.utils.Utils;
import com.lzy.okgo.OkGo;

import org.greenrobot.eventbus.EventBus;

import okhttp3.OkHttpClient;


/**
 * Created by hcg on 2018/4/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        initLog();
        OkGo.getInstance().init(this);

    }

    public static City getLocatedCity() {
        return locatedCity;
    }

    public static void setLocatedCity(City locatedCity) {
        MyApplication.locatedCity = locatedCity;
    }

    private static City locatedCity;

    private void initLog() {

    }


}
