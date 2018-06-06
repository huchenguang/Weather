package com.chenguang.weather.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by chenguang on 2017/8/1.
 */

public abstract class BaseFragment extends Fragment {
    protected Activity mActivity;
    protected View mRootView;
    private Unbinder unbinder;
    private boolean isInit = false;
    private boolean isLoaded = false;

    @Override
    public void onAttach(Activity activity) {
        this.mActivity = activity;
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutId(), container, false);
        isInit = true;
        if (getUserVisibleHint()) {
            lazyLoad();
        }
        return mRootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, mRootView);
        isVisibleToUser(true);
        initData();
        initView();
    }

    /**
     * 视图是否对用户可见
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isCanLoadData(isVisibleToUser);
    }

    private void isCanLoadData(boolean isVisibleToUser) {
        if (getUserVisibleHint() && isInit && !isLoaded) {
            lazyLoad();
            isLoaded = true;
        }
        if (isInit) {
            isVisibleToUser(isVisibleToUser);
        }
    }

    /**
     * 如果想在用户可见的时候加载数据，重写此方法
     */
    protected void lazyLoad() {

    }

    public void isVisibleToUser(boolean visible) {

    }

    protected abstract int getLayoutId();


    protected abstract void initData();

    protected abstract void initView();

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }

    public void visible(View... views) {
        for (View view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

    public void invisible(View... views) {
        for (View view : views) {
            view.setVisibility(View.INVISIBLE);
        }
    }

    protected void startAnotherActivity(Class cls) {
        startActivity(new Intent(mActivity, cls));
    }
}
