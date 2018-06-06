package com.chenguang.weather.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chenguang.weather.R;
import com.chenguang.weather.adapter.AdviseDetailAdapter;
import com.chenguang.weather.api.WeatherApi;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.bean.AdviseDetailBean;
import com.chenguang.weather.bean.AdviseTitleBean;
import com.chenguang.weather.utils.BarUtils;
import com.chenguang.weather.utils.RxUtils;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import io.reactivex.functions.Consumer;

public class AdviseDetailActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rv_detail)
    RecyclerView rvDetail;
    @BindView(R.id.title_bar)
    ConstraintLayout titleBar;
    private AdviseTitleBean mAdvise;
    private AdviseDetailAdapter mAdapter;
    private HeaderViewHolder headerViewHolder;
    private LinearLayoutManager linearLayoutManager;

    public static void startActivity(Context context, AdviseTitleBean adviseTitleBean) {
        Intent intent = new Intent(context, AdviseDetailActivity.class);
        intent.putExtra("advise", adviseTitleBean);
        context.startActivity(intent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_advise_detail;
    }

    @Override
    protected void initData() {
        mAdvise = (AdviseTitleBean) getIntent().getSerializableExtra("advise");
        BarUtils.setStatusBarAlpha(mActivity, 0);//设置为透明
        BarUtils.addMarginTopEqualStatusBarHeight(titleBar);
        titleBar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        titleBar.setAlpha(0);
    }

    @Override
    protected void initView() {
        tvTitle.setText(mAdvise.title);
        rvDetail.setLayoutManager(linearLayoutManager = new LinearLayoutManager(mActivity));
        rvDetail.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration
                .VERTICAL));
        rvDetail.setAdapter(mAdapter = new AdviseDetailAdapter(null));
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                AdviseDetailBean.CardsBean.ListBean item = (AdviseDetailBean.CardsBean.ListBean)
                        adapter.getData().get(position);
                AdviseMoreDetailActivity.startActivity(mActivity, item.data.wtrResource, item
                        .data.wtrLink.url);
            }
        });
        addHeader();
        getData();
        rvDetail.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                float scrollY = getRvDy();
                int height = headerViewHolder.rootView.getHeight() - titleBar.getHeight() -
                        BarUtils.getStatusBarHeight();
                float f = scrollY / height;
                if (f >= 1) {
                    titleBar.setAlpha(1);
                    BarUtils.setStatusBarColor(mActivity, getResources().getColor(R.color
                            .colorPrimary));
                } else {
                    titleBar.setAlpha(f);
                    BarUtils.setStatusBarColor(mActivity, getResources().getColor(R.color
                            .colorPrimary), Math.round(f * 255));
                }
            }
        });
    }

    private void addHeader() {
        headerViewHolder = new HeaderViewHolder();
        headerViewHolder.tvHeaderTitle.setText(mAdvise.title);
        headerViewHolder.tvHeaderContent.setText(mAdvise.headerSummary);
        Glide.with(mActivity)
                .load(mAdvise.imgUrl)
                .into(headerViewHolder.ivHeader);
        Glide.with(mActivity)
                .load(mAdvise.headerImgUrl)
                .into(headerViewHolder.ivBg);
        mAdapter.addHeaderView(headerViewHolder.rootView);
        View footer = mActivity.getLayoutInflater().inflate(R.layout.advise_footer,
                (ViewGroup) rvDetail.getParent(), false);
        mAdapter.addFooterView(footer);
    }

    @SuppressLint("CheckResult")
    private void getData() {
        WeatherApi.getInstance()
                .getAdviseDetail(mAdvise.channelId)
                .compose(RxUtils.<AdviseDetailBean>switchSchedulers())
                .subscribe(new Consumer<AdviseDetailBean>() {
                    @Override
                    public void accept(AdviseDetailBean adviseDetailBean) throws Exception {
                        showAdviseDetail(adviseDetailBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });
    }

    private void showAdviseDetail(AdviseDetailBean adviseDetailBean) {
        mAdapter.setNewData(adviseDetailBean.cards.get(0).list);
    }

    class HeaderViewHolder {
        private final Unbinder bind;
        View rootView;
        @BindView(R.id.iv_bg)
        ImageView ivBg;
        @BindView(R.id.iv_header)
        ImageView ivHeader;
        @BindView(R.id.tv_header_title)
        TextView tvHeaderTitle;
        @BindView(R.id.tv_header_content)
        TextView tvHeaderContent;
        @BindView(R.id.ll_content)
        RelativeLayout llContent;

        public HeaderViewHolder() {
            rootView = mActivity.getLayoutInflater().inflate(R.layout.advise_header_view,
                    (ViewGroup) rvDetail.getParent(), false);
            bind = ButterKnife.bind(this, rootView);
        }

        public void unbind() {
            if (bind != null) {
                bind.unbind();
            }
        }
    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (headerViewHolder != null) {
            headerViewHolder.unbind();
        }
    }

    public int getRvDy() {
        //获取第一个可见的item的位置
        int firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View firstVisiableChildView = linearLayoutManager.findViewByPosition
                (firstVisibleItemPosition);
        //计算出还未移出屏幕的高度
        int itemTop = firstVisiableChildView.getTop();
        //由于每个item的高度并不相同，所以就循环相加获取总高度
        int sumHeight = 0;
        for (int i = 0; i < firstVisibleItemPosition; i++) {
            sumHeight += linearLayoutManager.findViewByPosition(firstVisibleItemPosition)
                    .getHeight();
        }
        //减去该Item还未移出屏幕的部分可得出滑动的距离
        return sumHeight - itemTop;
    }
}
