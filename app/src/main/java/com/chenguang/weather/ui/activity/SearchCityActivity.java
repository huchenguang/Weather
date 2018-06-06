package com.chenguang.weather.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chenguang.weather.MyApplication;
import com.chenguang.weather.R;
import com.chenguang.weather.adapter.HotCityAdapter;
import com.chenguang.weather.adapter.SearchCityAdapter;
import com.chenguang.weather.api.DefaultListErrorConsumer;
import com.chenguang.weather.api.WeatherApi;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.bean.AddressBean;
import com.chenguang.weather.bean.City;
import com.chenguang.weather.event.CityEvent;
import com.chenguang.weather.utils.ActivityUtils;
import com.chenguang.weather.utils.BarUtils;
import com.chenguang.weather.utils.RxUtils;
import com.chenguang.weather.utils.SizeUtils;
import com.chenguang.weather.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchCityActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.iv_clear)
    ImageView ivClear;
    @BindView(R.id.rv_hot)
    RecyclerView rvHot;
    @BindView(R.id.ll_hot)
    LinearLayout llHot;
    @BindView(R.id.rv_search)
    RecyclerView rvSearch;
    @BindView(R.id.rl_root)
    RelativeLayout rlRoot;
    @BindView(R.id.tv_text)
    TextView tvText;
    private HotCityAdapter mHotCityAdapter;
    private SearchCityAdapter mSearchCityAdapter;
    private City locatedCity;
    private List<AddressBean> mAddresses;

    public static void startActivity(Context context, List<AddressBean> addressBeans) {
        Intent intent = new Intent(context, SearchCityActivity.class);
        intent.putExtra("address", (Serializable) addressBeans);
        context.startActivity(intent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_search_city;
    }

    @Override
    protected void initData() {
        BarUtils.setStatusBarColor(mActivity, getResources().getColor(R.color.bar_color_1));
        BarUtils.addMarginTopEqualStatusBarHeight(rlRoot);
        locatedCity = MyApplication.getLocatedCity();
        mAddresses = (List<AddressBean>) getIntent().getSerializableExtra
                ("address");
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String key = s.toString();
                if (!TextUtils.isEmpty(key)) {
                    ivClear.setVisibility(View.VISIBLE);
                    tvText.setVisibility(View.INVISIBLE);
                    rvHot.setVisibility(View.INVISIBLE);
                    rvSearch.setVisibility(View.VISIBLE);
                    searchKey(key);
                } else {
                    ivClear.setVisibility(View.GONE);
                    mSearchCityAdapter.getData().clear();
                    mSearchCityAdapter.notifyDataSetChanged();
                    tvText.setVisibility(View.VISIBLE);
                    ivClear.setVisibility(View.GONE);
                    rvHot.setVisibility(View.VISIBLE);
                    rvSearch.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @SuppressLint("CheckResult")
    private void searchKey(String key) {
        WeatherApi.getInstance()
                .searchCity(key)
                .compose(RxUtils.<List<City>>switchSchedulers())
                .subscribe(cities -> showSearchData(cities),
                        new DefaultListErrorConsumer() {
                            @Override
                            public void error() {
                                showSearchData(null);
                            }
                        }
                );
    }

    private void showSearchData(List<City> list) {
        if (list == null) {//加载数据失败
            if (mSearchCityAdapter.getData().size() < 1) {//数据加载失败
                mSearchCityAdapter.setEmptyView(getTextView("网络错误."));
                mSearchCityAdapter.notifyDataSetChanged();
            } else {//加载更多失败
                mSearchCityAdapter.loadMoreFail();
            }
            return;
        }
        //加载成功，但数据为空
        if (list.size() == 0 && mSearchCityAdapter.getData().size() == 0) {//数据真的为空
            mSearchCityAdapter.setEmptyView(getTextView("无匹配城市"));
            mSearchCityAdapter.notifyDataSetChanged();
            return;
        }
        //加载数据成功
        if (mSearchCityAdapter.getData().size() == 0) {//第一次加载数据
            mSearchCityAdapter.setNewData(list);
            mSearchCityAdapter.disableLoadMoreIfNotFullPage();
        } else {
            if (list.size() == 0) {//加载更多成功但数据为空
                mSearchCityAdapter.loadMoreEnd();
            } else {//加载更多成功
                mSearchCityAdapter.addData(list);
                mSearchCityAdapter.loadMoreComplete();
            }
        }
    }

    public TextView getTextView(String text) {
        TextView tv = new TextView(mActivity);
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.topMargin = SizeUtils.dp2px(40);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(lp);
        tv.setText(text);
        return tv;
    }

    @Override
    protected void initView() {
        rvHot.setLayoutManager(new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager
                .HORIZONTAL) {
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        rvHot.setAdapter(mHotCityAdapter = new HotCityAdapter(null));
        rvSearch.setLayoutManager(new LinearLayoutManager(mActivity));
        rvSearch.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration
                .VERTICAL));
        mSearchCityAdapter = new SearchCityAdapter(null);
        mSearchCityAdapter.bindToRecyclerView(rvSearch);
        mHotCityAdapter.setOnItemClickListener((adapter, view, position) -> {
            City city = (City) adapter.getData().get(position);
            addCityWeather(city);
        });
        mSearchCityAdapter.setOnItemClickListener((adapter, view, position) -> {
            City city = (City) adapter.getData().get(position);
            addCityWeather(city);
        });
        getHotCityData();
    }

    private void addCityWeather(City city) {
        ActivityUtils.finishToActivity(MainActivity.class, false);
        EventBus.getDefault().post(new CityEvent(city));
    }

    @SuppressLint("CheckResult")
    private void getHotCityData() {
        WeatherApi.getInstance()
                .getHotCities()
                .compose(RxUtils.<List<City>>switchSchedulers())
                .subscribe(cities -> showHotCityData(cities),
                        throwable -> {
                            ToastUtils.showShort("网络错误.");
                            showHotCityData(null);
                        });
    }

    private void showHotCityData(List<City> cities) {
        if (cities != null && cities.size() > 0) {
            rvHot.setLayoutManager(new StaggeredGridLayoutManager(cities.size() / 5 + 1,
                    StaggeredGridLayoutManager.HORIZONTAL) {
                @Override
                public boolean canScrollHorizontally() {
                    return false;
                }
            });
        } else {
            cities = new ArrayList<>();
        }
        if (locatedCity != null) {
            cities.add(0, locatedCity);
            locatedCity.isChecked = true;
        }
        for (City city : cities) {
            for (AddressBean mAddress : mAddresses) {
                if (city.affiliation.equals(mAddress.city.affiliation)) {
                    city.isChecked = true;
                }
            }
        }

        mHotCityAdapter.setNewData(cities);
    }

    @OnClick({R.id.iv_back, R.id.iv_clear})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.iv_clear:
                etSearch.setText("");
                break;
        }
    }

}
