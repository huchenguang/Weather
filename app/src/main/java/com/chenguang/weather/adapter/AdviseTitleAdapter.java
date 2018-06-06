package com.chenguang.weather.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.AdviseTitleBean;

import java.util.List;

/**
 * Created by hcg on 2018/5/3.
 */

public class AdviseTitleAdapter extends BaseQuickAdapter<AdviseTitleBean, BaseViewHolder> {
    public AdviseTitleAdapter(@Nullable List<AdviseTitleBean> data) {
        super(R.layout.item_adverse, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AdviseTitleBean item) {
        Glide.with(mContext)
                .load(item.imgUrl)
                .into((ImageView) helper.getView(R.id.iv_title));
        helper.setText(R.id.tv_adverse, item.title);
        View view=new View(mContext);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver
                .OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {

            }
        });
    }
}
