package com.chenguang.weather.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chenguang.weather.R;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.bean.OutLookWeather;
import com.chenguang.weather.utils.BarUtils;
import com.chenguang.weather.widget.ScrollFutureDaysWeatherView;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OutLookActivity extends BaseActivity {
    @BindView(R.id.sfdwv)
    ScrollFutureDaysWeatherView scrollFutureDaysWeatherView;
    @BindView(R.id.ll_root)
    LinearLayout llRoot;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private List<OutLookWeather> datas;

    public static void startActivity(Context context, List<OutLookWeather> outLookWeathers) {
        Intent intent = new Intent(context, OutLookActivity.class);
        intent.putExtra("data", (Serializable) outLookWeathers);
        context.startActivity(intent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_out_look;
    }

    @Override
    protected void initData() {
        datas = (List<OutLookWeather>) getIntent().getSerializableExtra("data");
        tvTitle.setText(String.format("%d天趋势预报", datas.size()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            BarUtils.setStatusBarColor(mActivity, Color.WHITE);
            BarUtils.addMarginTopEqualStatusBarHeight(llRoot);
            BarUtils.setStatusBarLightMode(mActivity, true);
        }
    }


    @Override
    protected void initView() {
        if (datas != null) {
            scrollFutureDaysWeatherView.setData(datas);
        }
    }


    @OnClick(R.id.iv_close)
    public void onClick() {
        finish();
    }
}
