package com.chenguang.weather.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.GlideApp;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.OutLookWeather;
import com.chenguang.weather.utils.WeatherUtils;

import java.util.List;

/**
 * Created by hcg on 2018/5/8.
 */

public class OutLookAdapter extends BaseQuickAdapter<OutLookWeather, BaseViewHolder> {
    public OutLookAdapter(@Nullable List<OutLookWeather> data) {
        super(R.layout.item_outlook, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, OutLookWeather item) {
        helper.setText(R.id.tv_day, item.week).setText(R.id.tv_temperature, String.format("%d / " +
                "%d℃", item.highTemperature, item.lowTemperature));
        if (item.weatherDay.weatherId == item.weatherNight.weatherId) {
            helper.setText(R.id.tv_weather, String.format("%s | %s", item.weatherDay.weather, item
                    .airQuality));
        } else {
            helper.setText(R.id.tv_weather, String.format("%s转%s | %s", item.weatherDay.weather,
                    item.weatherNight.weather, item.airQuality));
        }


        TextView tv_weather = helper.getView(R.id.tv_weather);
        Drawable drawable = mContext.getResources().getDrawable(item.weatherDay.iconRes);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        tv_weather.setCompoundDrawables(drawable, null, null, null);
    }
}
