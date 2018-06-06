package com.chenguang.weather.ui.activity;


import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import com.chenguang.weather.MyApplication;
import com.chenguang.weather.R;
import com.chenguang.weather.adapter.BaseFragmentPagerAdapter;
import com.chenguang.weather.api.ConstantValues;
import com.chenguang.weather.base.BaseActivity;
import com.chenguang.weather.base.BaseFragment;
import com.chenguang.weather.bean.AddressBean;
import com.chenguang.weather.bean.City;
import com.chenguang.weather.event.CityEvent;
import com.chenguang.weather.event.MoveCityEvent;
import com.chenguang.weather.ui.fragment.WeatherFragment;
import com.chenguang.weather.utils.IntentUtils;
import com.chenguang.weather.utils.PermissionConstants;
import com.chenguang.weather.utils.PermissionUtils;
import com.chenguang.weather.utils.SPUtils;
import com.chenguang.weather.utils.SizeUtils;
import com.chenguang.weather.utils.ToastUtils;
import com.chenguang.weather.widget.PopupShareWindow;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.iv_add)
    ImageView ivAdd;
    @BindView(R.id.iv_more)
    ImageView ivMore;
    @BindView(R.id.rb_main)
    RadioGroup rbMain;
    @BindView(R.id.ll_main_indicator)
    LinearLayout llMainIndicator;
    public AMapLocationClient mLocationClient = null;
    @BindView(R.id.ll_bottom)
    LinearLayout llBottom;
    private List<BaseFragment> fragments = new ArrayList<>();
    private BaseFragmentPagerAdapter mAdapter;
    List<City> mCities;
    private PopupShareWindow popupShareWindow;
    protected String appId = "11292435";

    protected String appKey = "xEKiGBGXbXmj2UG01Uo1X2O4";

    protected String secretKey = "CGRvahyjG9UAjDT9cvzROoCxYSAy9jxS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EventBus.getDefault().register(this);
        super.onCreate(savedInstanceState);
        requestRequestPermission();
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mCities = getCityFromSP();
        initSpeaker();
    }

    @Override
    protected void initView() {
        mAdapter = new BaseFragmentPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(mAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int
                    positionOffsetPixels) {
                ((RadioButton) rbMain.getChildAt(position)).setChecked(true);
                ((WeatherFragment) (mAdapter.getFragments().get(position))).stopPlay();
            }

            @Override
            public void onPageSelected(int position) {
                ((WeatherFragment) (mAdapter.getFragments().get(position))).setStatusBarDynamicly();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setOffscreenPageLimit(10);
        if (mCities != null) {//取出缓存数据
            for (City city : mCities) {
                if (city != null) {
                    update(city);
                }
            }
            mCities = null;
        }
        locate();
    }

    @OnClick({R.id.iv_add, R.id.iv_more})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_add:
                AddressActivity.startActivity(mActivity, getAllAddresses());
                break;
            case R.id.iv_more:
                if (popupShareWindow == null) {
                    popupShareWindow = new PopupShareWindow(mActivity);
                    popupShareWindow.setOnItemClickListener(v -> {
                        switch (v.getId()) {
                            case R.id.iv_add:
                                AddressActivity.startActivity(mActivity, getAllAddresses());
                                break;
                            case R.id.tv_share:
                                shareIt();
                                break;
                            case R.id.tv_sound:
                                ((WeatherFragment) (mAdapter.getFragments().get(viewPager
                                        .getCurrentItem())))
                                        .speakWeather();
                                break;
                        }
                    });
                }
                popupShareWindow.showPopupWindow();
                break;
        }
    }


    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - lastMillis > 2000) {
            lastMillis = System.currentTimeMillis();
            ToastUtils.showShort("再按一次退出");
        } else {
            super.onBackPressed();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateWeatherFragment(CityEvent event) {
        if (event.isDelete) {//删除一个城市
            delete(event.city);
            saveCityToSp();
        } else {
            update(event.city);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void moveCityPosition(MoveCityEvent event) {
        int from = isAlreadyExists(event.sourceCity);
        int to = isAlreadyExists(event.desCity);
        mAdapter.moveFragmentPosition(from, to);
        saveCityToSp();
    }

    private void delete(City city) {
        int index = isAlreadyExists(city);
        if (index != -1) {
            if (viewPager.getCurrentItem() == index) {
                viewPager.setCurrentItem(0);
            }
            rbMain.removeViewAt(index);
            mAdapter.removeFragment(index);
        }
        saveCityToSp();
    }

    private void update(City city) {
        int index = isAlreadyExists(city);
        //不存在
        if (index == -1) {
            if (mAdapter.getFragments().size() > 9) {
                ToastUtils.showShort("最多添加10个城市");
                viewPager.setCurrentItem(0);
                return;
            }
            RadioButton rb = new RadioButton(mActivity);
            rb.setButtonDrawable(null);
            if (mAdapter.getFragments().size() == 0) {//首个
                rb.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable
                        .selector_main_first), null, null, null);
            } else {
                rb.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.drawable
                        .selector_main_dot), null, null, null);
            }

            RadioGroup.LayoutParams lp = new RadioGroup.LayoutParams(ViewGroup
                    .LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.setMargins(SizeUtils.dp2px(8), 0, 0, 0);
            rbMain.addView(rb, lp);
//            fragments.add(WeatherFragment.newInstance(city));
//            mAdapter.notifyDataSetChanged();
            mAdapter.addFragment(WeatherFragment.newInstance(city));
            viewPager.setCurrentItem(mAdapter.getFragments().size() - 1, false);
        } else {
            ((WeatherFragment) (mAdapter.getFragments().get(index))).updateLocateWeather(city);
            viewPager.setCurrentItem(index, false);
        }
        saveCityToSp();
    }

    private void saveCityToSp() {
        SPUtils.getInstance(ConstantValues.SP_FILE_NAME).put("addresses", new Gson().toJson
                (getAllCities()));
    }

    public void setCanSlipping(boolean enable) {
        try {
            Field mIsBeingDragged = viewPager.getClass().getDeclaredField("mIsBeingDragged");
            mIsBeingDragged.setAccessible(true);
            mIsBeingDragged.setBoolean(viewPager, enable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private SpeechSynthesizer mSpeechSynthesizer = null;
    private boolean isSpeaking = false;

    public void initSpeaker() {
        mSpeechSynthesizer = SpeechSynthesizer.getInstance();
        mSpeechSynthesizer.setContext(mActivity);
        mSpeechSynthesizer.setSpeechSynthesizerListener(new SpeechSynthesizerListener() {
            @Override
            public void onSynthesizeStart(String s) {

            }

            @Override
            public void onSynthesizeDataArrived(String s, byte[] bytes, int i) {

            }

            @Override
            public void onSynthesizeFinish(String s) {

            }

            @Override
            public void onSpeechStart(String s) {
                isSpeaking = true;
            }

            @Override
            public void onSpeechProgressChanged(String s, int i) {
            }

            @Override
            public void onSpeechFinish(String s) {
                isSpeaking = false;
            }

            @Override
            public void onError(String s, SpeechError speechError) {

            }
        });
        mSpeechSynthesizer.setAppId(appId);
        mSpeechSynthesizer.setApiKey(appKey, secretKey);
        mSpeechSynthesizer.auth(TtsMode.ONLINE);  // 纯在线
        mSpeechSynthesizer.setParam(SpeechSynthesizer.PARAM_SPEAKER, "0");
        mSpeechSynthesizer.initTts(TtsMode.ONLINE);
    }

    private void shareIt() {
        Bitmap bitmap = ((WeatherFragment) (mAdapter.getFragments().get(viewPager.getCurrentItem
                ())))
                .getCapturedImg();
        Intent shareImageIntent = IntentUtils.getShareImageIntent("weather", Uri.parse(MediaStore
                .Images.Media.insertImage(getContentResolver(), bitmap, null, null)));
        startActivity(shareImageIntent);
    }

    private long lastMillis;

    private void locate() {
        //初始化定位
        mLocationClient = new AMapLocationClient(mActivity);
        //设置定位回调监听
        mLocationClient.setLocationListener((AMapLocation aMapLocation) -> {
            City locatedCity = new City();
            if (aMapLocation != null && aMapLocation.getLatitude() != 0 && aMapLocation
                    .getLongitude() != 0) {
                locatedCity.longitude = aMapLocation.getLongitude();
                locatedCity.latitude = aMapLocation.getLatitude();
                locatedCity.name = aMapLocation.getDistrict() + " " + aMapLocation.getStreet();
                locatedCity.affiliation = aMapLocation.getDistrict() + " " + aMapLocation
                        .getStreet();
            } else {
                locatedCity.affiliation = locatedCity.name = ConstantValues.LOCATE_FAILED;
            }
            locatedCity.isLocate = true;
            MyApplication.setLocatedCity(locatedCity);
            if (mCities == null || mCities.size() == 0) {
                update(locatedCity);
            } else {
                ((WeatherFragment) (mAdapter.getFragments().get(0))).updateLocateWeather
                        (locatedCity);
                saveCityToSp();
            }
            mAdapter.notifyDataSetChanged();
        });
        AMapLocationClientOption options = new AMapLocationClientOption();
        options.setOnceLocation(true);
        mLocationClient.setLocationOption(options);
        //启动定位
        mLocationClient.startLocation();
    }

    public int isAlreadyExists(City city) {
        if (mCities != null && mCities.size() != 0) {
            return -1;
        }
        List<AddressBean> allAddresses = getAllAddresses();
        if (allAddresses.size() == 0) {
            return -1;
        }
        if (city.isLocate) {
            return 0;
        }
        for (int i = 0; i < allAddresses.size(); i++) {
            if (allAddresses.get(i).city.affiliation.equals(city.affiliation)) {
                return i;
            }
        }
        return -1;
    }

    public List<AddressBean> getAllAddresses() {
        List<AddressBean> addressBeans = new ArrayList<>();
        for (BaseFragment fragment : mAdapter.getFragments()) {
            addressBeans.add(((WeatherFragment) fragment).getAddressBean());
        }
        return addressBeans;
    }

    public List<City> getAllCities() {
        List<City> cities = new ArrayList<>();
        for (BaseFragment fragment : mAdapter.getFragments()) {
            cities.add(((WeatherFragment) fragment).getAddressBean().city);
        }
        return cities;
    }

    private boolean isPausing = false;

    public void speakIt(String text) {
        if (mSpeechSynthesizer != null) {
            if (!isPausing) {
                isPausing = true;
                mSpeechSynthesizer.speak(text);
            } else {
                isPausing = false;
                mSpeechSynthesizer.stop();
            }
        }
    }

    private List<City> getCityFromSP() {
        String json = SPUtils.getInstance(ConstantValues.SP_FILE_NAME).getString("addresses");
        if (!TextUtils.isEmpty(json)) {
            return new Gson().fromJson(json, new TypeToken<List<City>>() {
            }.getType());
        }
        return null;
    }

    private void requestRequestPermission() {
        PermissionUtils.permission(PermissionConstants.STORAGE, PermissionConstants
                .getPermissions(PermissionConstants.LOCATION)[0], PermissionConstants
                .getPermissions(PermissionConstants.PHONE)[0])
                .rationale(shouldRequest -> PermissionUtils.launchAppDetailsSettings())
                .callback(new PermissionUtils.FullCallback() {
                    @Override
                    public void onGranted(List<String> permissionsGranted) {
                        if (permissionsGranted.contains(PermissionConstants.getPermissions
                                (PermissionConstants.LOCATION)[0])) {
                            //启动定位
                            mLocationClient.startLocation();
                        }
                    }

                    @Override
                    public void onDenied(List<String> permissionsDeniedForever, List<String>
                            permissionsDenied) {

                    }
                })
                .request();
    }

    public void startLocation() {
        if (mLocationClient != null) {
            mLocationClient.startLocation();
        }
    }

    public int getBottomNavWidthOnScreenY() {
        int[] location = new int[2];
        llBottom.getLocationOnScreen(location);
        return location[1];
    }
}
