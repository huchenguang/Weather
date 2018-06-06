package com.chenguang.weather.api;

import com.chenguang.weather.utils.ToastUtils;

import java.net.UnknownHostException;

import io.reactivex.functions.Consumer;

/**
 * Created by a on 2018/4/13.
 */

public abstract class DefaultListErrorConsumer implements Consumer<Throwable> {
    @Override
    public void accept(Throwable throwable) throws Exception {
        if (throwable instanceof UnknownHostException) {
            ToastUtils.showShort("网络异常，请检查网络连接.");
        } else {
            ToastUtils.showShort(throwable.getMessage());
        }
        throwable.printStackTrace();
        error();
    }

    public abstract void error();
}
