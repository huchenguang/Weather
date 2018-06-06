package com.chenguang.weather.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chenguang.weather.R;
import com.chenguang.weather.bean.AdviseDetailBean;

import java.util.List;

/**
 * Created by hcg on 2018/5/5.
 */

public class AdviseDetailAdapter extends BaseMultiItemQuickAdapter<AdviseDetailBean.CardsBean
        .ListBean, BaseViewHolder> {
    public static final int TYPE_ONE = 1000010;
    public static final int TYPE_THREE = 1000011;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public AdviseDetailAdapter(List<AdviseDetailBean.CardsBean.ListBean> data) {
        super(data);
        addItemType(TYPE_ONE, R.layout.item_advise_detail_one);
        addItemType(TYPE_THREE, R.layout.item_advise_detail_three);
    }

    @Override
    protected void convert(BaseViewHolder helper, AdviseDetailBean.CardsBean.ListBean item) {
        switch (item.getItemType()) {
            case TYPE_ONE:
                bindOneData(helper, item);
                break;
            case TYPE_THREE:
                bindThreeData(helper, item);
                break;
        }
    }

    private void bindThreeData(BaseViewHolder helper, AdviseDetailBean.CardsBean.ListBean item) {
        helper.setText(R.id.tv_title, item.data.wtrTitle)
                .setText(R.id.tv_from, item.data.wtrResource);
        try {
            Glide.with(mContext)
                    .load(item.data.wtrImges.get(0))
                    .into((ImageView) helper.getView(R.id.iv_1));
            Glide.with(mContext)
                    .load(item.data.wtrImges.get(1))
                    .into((ImageView) helper.getView(R.id.iv_2));
            Glide.with(mContext)
                    .load(item.data.wtrImges.get(2))
                    .into((ImageView) helper.getView(R.id.iv_3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bindOneData(BaseViewHolder helper, AdviseDetailBean.CardsBean.ListBean item) {
        helper.setText(R.id.tv_title, item.data.wtrTitle)
                .setText(R.id.tv_from, item.data.wtrResource);

        Glide.with(mContext)
                .load(item.data.wtrImges.get(0))
                .into((ImageView) helper.getView(R.id.iv_title));

    }
}

