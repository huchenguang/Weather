package com.chenguang.weather.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.GlideApp;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.AddressBean;
import com.chenguang.weather.utils.Utils;

import java.util.List;

/**
 * Created by hcg on 2018/5/14.
 */

public class AddressAdapter extends BaseItemDraggableAdapter<AddressBean, BaseViewHolder> {
    public AddressAdapter(List<AddressBean> data) {
        super(R.layout.item_address, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AddressBean item) {
        if (item.city.name.equals("定位失败")) {
            helper.setText(R.id.tv_address, item.city.name);
        } else {
            helper.setText(R.id.tv_temperature, String.format("%d℃", item.header.currTemp))
                    .setText(R.id.tv_address, item.city.name);
            GlideApp.with(mContext)
                    .load(item.header.weather.iconRes)
                    .into((ImageView) helper.getView(R.id.iv_head));
            final TextView tvAddress = helper.getView(R.id.tv_address);
            if (item.city.isLocate) {
                helper.setVisible(R.id.iv, false);
                GlideApp.with(mContext)
                        .load(R.mipmap.icon_locate)
                        .into(new SimpleTarget<Drawable>() {
                            @Override
                            public void onResourceReady(@NonNull Drawable resource, @Nullable
                                    Transition<? super Drawable> transition) {
                                tvAddress.setCompoundDrawablesWithIntrinsicBounds(null, null,
                                        resource, null);
                            }
                        });
            } else {
                helper.setVisible(R.id.iv, true);
                tvAddress.setCompoundDrawablesWithIntrinsicBounds(null, null,
                        null, null);
            }
        }
    }
}
