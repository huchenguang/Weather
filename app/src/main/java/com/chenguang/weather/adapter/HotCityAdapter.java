package com.chenguang.weather.adapter;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.City;

import java.util.List;

/**
 * Created by hcg on 2018/5/6.
 */

public class HotCityAdapter extends BaseQuickAdapter<City, BaseViewHolder> {
    public HotCityAdapter(@Nullable List<City> data) {
        super(R.layout.item_hot_city, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, City item) {
        TextView tvName = helper.getView(R.id.tv_name);
        if (item.isLocate) {
            tvName.setText("定位");
            tvName.setTextColor(Color.parseColor("#2397f0"));
            Drawable drawable = mContext.getResources().getDrawable(R.mipmap.icon_locate);
            tvName.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
        } else {
            tvName.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            tvName.setText(item.name);
        }
        if (item.isChecked) {
            tvName.setTextColor(Color.parseColor("#2397f0"));
        } else {
            tvName.setTextColor(mContext.getResources().getColor(R.color.text_black));
        }
    }
}
