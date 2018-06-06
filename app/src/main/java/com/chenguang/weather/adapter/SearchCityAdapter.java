package com.chenguang.weather.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.City;

import java.util.List;

/**
 * Created by hcg on 2018/5/6.
 */

public class SearchCityAdapter extends BaseQuickAdapter<City, BaseViewHolder> {
    public SearchCityAdapter(@Nullable List<City> data) {
        super(R.layout.item_search_city, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, City item) {
        helper.setText(R.id.tv_address, String.format("%s - %s", item.name, item.affiliation));
    }
}
