package com.chenguang.weather.ui.activity;

import com.chenguang.weather.R;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.bean.WeatherBean;
import com.chenguang.weather.widget.MiuiWeatherView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class TestActivity extends BaseActivity {
    @BindView(R.id.weather)
    MiuiWeatherView weather;
    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }
}
