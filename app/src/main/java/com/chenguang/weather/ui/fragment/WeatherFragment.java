package com.chenguang.weather.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chenguang.weather.GlideApp;
import com.chenguang.weather.GyroscopeObserver;
import com.chenguang.weather.R;
import com.chenguang.weather.adapter.AdviseTitleAdapter;
import com.chenguang.weather.adapter.OutLookAdapter;
import com.chenguang.weather.api.ConstantValues;
import com.chenguang.weather.base.BaseFragment;
import com.chenguang.weather.bean.AddressBean;
import com.chenguang.weather.bean.AdviseTitleBean;
import com.chenguang.weather.bean.City;
import com.chenguang.weather.bean.HeaderBean;
import com.chenguang.weather.bean.HoursForecastBean;
import com.chenguang.weather.bean.OutLookWeather;
import com.chenguang.weather.bean.VideoBean;
import com.chenguang.weather.ui.activity.AdviseDetailActivity;
import com.chenguang.weather.ui.activity.MainActivity;
import com.chenguang.weather.ui.activity.OutLookActivity;
import com.chenguang.weather.ui.contract.WeatherContract;
import com.chenguang.weather.ui.presenter.WeatherForecastPresenter;
import com.chenguang.weather.utils.BarUtils;
import com.chenguang.weather.utils.CaptureUtils;
import com.chenguang.weather.utils.ToastUtils;
import com.chenguang.weather.widget.DrawableCenterTextView;
import com.chenguang.weather.widget.MiuiWeatherView;
import com.chenguang.weather.widget.MyScrollView;
import com.chenguang.weather.widget.WeatherAnimView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;
import io.reactivex.Observable;

import static cn.jzvd.JZVideoPlayer.SCREEN_WINDOW_NORMAL;

/**
 * Created by hcg on 2018/4/26.
 */

public class WeatherFragment extends BaseFragment implements WeatherContract.View {
    @BindView(R.id.weather_header)
    WeatherAnimView weatherHeader;
    @BindView(R.id.weather)
    MiuiWeatherView miuiWeatherView;
    @BindView(R.id.rv_advise_title)
    RecyclerView rvAdviseTitle;
    @BindView(R.id.tv_hours_forecast)
    TextView tvHoursForecast;
    @BindView(R.id.rv_outlook)
    RecyclerView rvOutlook;
    @BindView(R.id.tv_h_curr_temp)
    TextView tvHCurrTemp;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.tv_h_curr_weather)
    TextView tvHCurrWeather;
    @BindView(R.id.tv_h_aqi)
    DrawableCenterTextView tvHAqi;
    @BindView(R.id.tv_h_rain)
    DrawableCenterTextView tvHRain;
    @BindView(R.id.player)
    JZVideoPlayerStandard player;
    @BindView(R.id.scroll_view)
    MyScrollView scrollView;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_center_title)
    TextView tvCenterTitle;
    @BindView(R.id.title_bar)
    ConstraintLayout titleBar;
    @BindView(R.id.rl_header)
    RelativeLayout rlHeader;
    @BindView(R.id.refresh_layout)
    SmartRefreshLayout refreshLayout;
    @BindView(R.id.rl_root)
    RelativeLayout rlRoot;
    private GyroscopeObserver gyroscopeObserver;
    private AdviseTitleAdapter mAdviseAdapter;
    private List<OutLookWeather> mOutLookWeathers;
    private OutLookAdapter mOutLookAdapter;
    private View view_outlook_footer;
    private TextView tv_outlook_all;
    private WeatherForecastPresenter mPresenter;
    private HeaderBean mHeaderBean;
    private City currCity;
    private AddressBean mAddressBean;


    public static WeatherFragment newInstance(City city) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("city", city);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_weather;
    }

    @Override
    protected void initData() {
        currCity = (City) getArguments().getSerializable("city");
        BarUtils.setStatusBarAlpha(mActivity, 0);
        BarUtils.addMarginTopEqualStatusBarHeight(titleBar);
        invisible(ivBack, tvTitle);
        visible(tvCenterTitle);
        tvCenterTitle.setTextColor(getResources().getColor(R.color.text_light_gray));
        tvCenterTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        titleBar.setBackgroundColor(Color.WHITE);
        titleBar.setAlpha(0);
        scrollView.setOnScrollChanged((l, t, oldl, oldt) -> {
            stopPlay();
            setStatusBarDynamicly();
        });
        player.batteryTimeLayout.setVisibility(View.INVISIBLE);
        mPresenter = new WeatherForecastPresenter();
        mPresenter.attachView(this);
    }


    @Override
    public void onResume() {
        super.onResume();
        gyroscopeObserver.register(mActivity);
        setStatusBarDynamicly();
    }

    @Override
    public void onPause() {
        super.onPause();
        JZVideoPlayer.releaseAllVideos();
        gyroscopeObserver.unregister();
    }

    /*@Override
    public void isVisibleToUser(boolean visible) {
        if (visible) {
            setStatusBarDynamicly();
        }
    }*/

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void initView() {
        //header_bg
        gyroscopeObserver = new GyroscopeObserver();
        weatherHeader.setGyroscopeObserver(gyroscopeObserver);
        //趋势预报
        view_outlook_footer = getLayoutInflater().inflate(R.layout.item_outlook_footer, (ViewGroup)
                rvOutlook.getParent(), false);
        view_outlook_footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OutLookActivity.startActivity(mActivity, mOutLookWeathers);
            }
        });
        tv_outlook_all = view_outlook_footer.findViewById(R.id.tv_outlook_all);
        rvOutlook.setLayoutManager(new LinearLayoutManager(mActivity));
        rvOutlook.addItemDecoration(new DividerItemDecoration(mActivity, DividerItemDecoration
                .VERTICAL));
        rvOutlook.setAdapter(mOutLookAdapter = new OutLookAdapter(null));
        //建议
        rvAdviseTitle.setLayoutManager(new GridLayoutManager(mActivity, 4));
        rvAdviseTitle.setAdapter(mAdviseAdapter = new AdviseTitleAdapter(null));
        mAdviseAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                AdviseTitleBean adviseTitleBean = (AdviseTitleBean) adapter.getData().get(position);
                AdviseDetailActivity.startActivity(mActivity, adviseTitleBean);
            }
        });
        //解决view左右滑动有view_pager左右滑动的冲突
        miuiWeatherView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        ((MainActivity) mActivity).setCanSlipping(false);
                        break;
                    case MotionEvent.ACTION_UP:
                        ((MainActivity) mActivity).setCanSlipping(true);
                        break;
                }
                return false;
            }
        });
        //刷新
        refreshLayout.setOnRefreshListener(refreshLayout -> {
            //请求数据
            if (currCity != null) {
                if (currCity.affiliation.equals(ConstantValues.LOCATE_FAILED)) {//定位失败
                    ((MainActivity) mActivity).startLocation();
                } else {
                    mPresenter.getWeatherForecast(currCity.latitude + "", currCity.longitude + "");
                    mPresenter.getAdviseData(currCity.latitude + "", currCity.longitude + "");
                }
            } else {
                refreshLayout.finishRefresh(100);
            }
        });
        refreshLayout.autoRefresh();
    }

    @Override
    public void showOutLookWeathers(List<OutLookWeather> outLookWeathers) {
        //显示前三天的天气
        if (outLookWeathers != null) {
            List<OutLookWeather> dayWeathers = outLookWeathers.subList(1, 4);
            mOutLookAdapter.setNewData(dayWeathers);
            if (view_outlook_footer.getParent() == null) {
                mOutLookAdapter.addFooterView(view_outlook_footer);
            }
            tv_outlook_all.setText(String.format("%d天趋势预报", outLookWeathers.size()));
        }
        mOutLookWeathers = outLookWeathers;
    }

    @Override
    public void showHoursWeather(HoursForecastBean hoursForecastBean) {
        tvHoursForecast.setText(hoursForecastBean.title);
        miuiWeatherView.setData(hoursForecastBean.list);
    }

    @Override
    public void showAdviseTitleBean(List<AdviseTitleBean> adviseTitleBeans) {
        mAdviseAdapter.setNewData(adviseTitleBeans);
    }

    @Override
    public void finish() {
        refreshLayout.finishRefresh(100);
    }

    @Override
    public void showVideo(VideoBean videoBean) {
        player.setUp(videoBean.videoUrl, SCREEN_WINDOW_NORMAL, "");
        GlideApp.with(mActivity).load(videoBean.imgUrl).into(player.thumbImageView);
    }

    @Override
    public void showHeaderData(HeaderBean headerBean) {
        this.mHeaderBean = headerBean;
        mHeaderBean.address = currCity.name;
        tvCenterTitle.setText(String.format("%s %d℃", currCity.name, headerBean.currTemp));
        tvAddress.setText(currCity.name);
        GlideApp.with(mActivity)
                .load(headerBean.weather.iconRes)
                .into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable
                            Transition<? super Drawable> transition) {
                        tvCenterTitle.setCompoundDrawablesWithIntrinsicBounds(resource, null,
                                null, null);
                    }
                });
        tvHCurrTemp.setText(String.format("%d℃", headerBean.currTemp));
        tvHCurrWeather.setText(headerBean.weather.weather);
        tvHAqi.setText(String.format("空气%d %s", headerBean.aqi, headerBean.aqiStr));
        tvHRain.setText(headerBean.hourForecast);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateLocateWeather(City city) {
        currCity = city;
        if (city.name.equals("定位失败")) {//如果是定位的城市
            tvAddress.setText("请开启定位权限或网络连接");
            refreshLayout.finishRefresh(100);
        } else {
            tvAddress.setText(city.affiliation);
            mPresenter.getWeatherForecast(city.latitude + "", city.longitude + "");
            mPresenter.getAdviseData(city.latitude + "", city.longitude + "");
        }
    }

    public AddressBean getAddressBean() {
        if (mAddressBean == null) {
            mAddressBean = new AddressBean();
        }
        mAddressBean.city = currCity;
        mAddressBean.header = mHeaderBean;
        return mAddressBean;
    }

    public void speakWeather() {
        StringBuilder sb = new StringBuilder("为你播报最新天气，");
        sb.append(mHeaderBean.address);
        sb.append("当前天气为" + mHeaderBean.weather.weather + "，");
        sb.append("温度为" + mHeaderBean.currTemp + "摄氏度，");
        sb.append("空气质量指数为" + mHeaderBean.aqi + "，" + mHeaderBean.aqiStr + "，");
        sb.append(mHeaderBean.hourForecast);
        ((MainActivity) mActivity).speakIt(sb.toString());
    }

    public void stopPlay() {
        if (player.currentState == JZVideoPlayer.CURRENT_STATE_PLAYING) {
            player.startButton.performClick();
        }
    }

    public Bitmap getCapturedImg() {
        return CaptureUtils.getScrollViewBitmap(scrollView);
    }

    public void setStatusBarDynamicly() {
        if (scrollView != null) {
            int scrollY = scrollView.getScrollY();

            int width = rlHeader.getHeight() - titleBar.getHeight() - BarUtils
                    .getStatusBarHeight();
            if (width * 3 / 4 > scrollY || width <= 0) {
                titleBar.setAlpha(0);
                BarUtils.setStatusBarColor(mActivity, Color.WHITE, 0);
                BarUtils.setStatusBarLightMode(mActivity, false);
                return;
            }
            float f = Math.abs((width * 3 / 4 - scrollY) / ((width + 0f) / 4));
            if (f >= 1) {
                titleBar.setAlpha(1);
                BarUtils.setStatusBarColor(mActivity, Color.WHITE);
                BarUtils.setStatusBarLightMode(mActivity, true);
            } else {
                BarUtils.setStatusBarColor(mActivity, Color.WHITE, (int) (f * 255 + 0.5));
                if (f > 0.6) {
                    BarUtils.setStatusBarLightMode(mActivity, true);
                } else {
                    BarUtils.setStatusBarLightMode(mActivity, false);
                }
                titleBar.setAlpha(f);
            }
        }
    }

    public int getPlayerOnScreenY() {
        int[] location = new int[2];
        player.getLocationOnScreen(location);
        return location[1];
    }
}
