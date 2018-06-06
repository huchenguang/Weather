package com.chenguang.weather.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.chenguang.weather.ui.activity.AdviseMoreDetailActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity extends AppCompatActivity {
    protected Activity mActivity;
    private Unbinder unbind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mActivity = this;
        unbind = ButterKnife.bind(this);
        initData();
        initView();
    }

    public abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void initView();

    @Override
    protected void onDestroy() {
        if (unbind != null) {
            unbind.unbind();
        }
        super.onDestroy();
    }

    /*public static void startActivity(Context context) {
        Intent intent = new Intent(context, AdviseMoreDetailActivity.class);
        context.startActivity(intent);
    }*/

    protected void startAnotherActivity(Class cls) {
        startActivity(new Intent(this, cls));
    }
}
