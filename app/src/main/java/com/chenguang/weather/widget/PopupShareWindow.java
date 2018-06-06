package com.chenguang.weather.widget;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

import com.chenguang.weather.R;

import java.util.List;

import razerdp.basepopup.BasePopupWindow;

/**
 * Created by hcg on 2018/5/22.
 */

public class PopupShareWindow extends BasePopupWindow implements View.OnClickListener {
    public PopupShareWindow(Context context) {
        super(context);
        View iv_more = findViewById(R.id.iv_more);
        iv_more.setOnClickListener(this);
        findViewById(R.id.iv_add).setOnClickListener(this);
        findViewById(R.id.tv_sound).setOnClickListener(this);
        findViewById(R.id.tv_share).setOnClickListener(this);
        findViewById(R.id.ll_bottom).setOnClickListener(this);
    }

    @Override
    protected Animation initShowAnimation() {
        return getTranslateVerticalAnimation(1f, 0f, 400);
    }

    @Override
    public View getClickToDismissView() {
        return findViewById(R.id.rl_root);
    }

    @Override
    public View onCreatePopupView() {
        return View.inflate(getContext(), R.layout.popup_share, null);
    }

    @Override
    public View initAnimaView() {
        return findViewById(R.id.popup_anim);
    }

    @Override
    public void showPopupWindow(View v) {
        super.showPopupWindow(v);
    }

    @Override
    public void onClick(View v) {
        dismiss();
        if (mListener != null) {
            mListener.onItemClick(v);
        }
    }

    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(View v);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mListener = listener;
    }
}
