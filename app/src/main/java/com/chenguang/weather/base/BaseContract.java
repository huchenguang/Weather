package com.chenguang.weather.base;

/**
 * Created by chenguang on 2018/1/16.
 */

public interface BaseContract {
    interface BaseView {

    }

    interface BasePresenter<T> {
        void attachView(T view);

        void detachView();
    }
}
