package com.chenguang.weather.api;

import android.util.Log;

import com.chenguang.weather.utils.ToastUtils;

import java.net.UnknownHostException;

import io.reactivex.functions.Consumer;

/**
 * Created by hcg on 2018/5/13.
 */

public class DefaultErrorConsumer implements Consumer<Throwable> {
    @Override
    public void accept(Throwable throwable) throws Exception {
        if (throwable instanceof UnknownHostException) {
            ToastUtils.showShort("网络异常，请检查网络连接.");
        } else {
            ToastUtils.showShort(throwable.getMessage());
        }
        Log.e("error:", throwable.getMessage());
    }
}
