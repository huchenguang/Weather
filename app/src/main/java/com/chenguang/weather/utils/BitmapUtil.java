package com.chenguang.weather.utils;

import android.content.res.Resources;
import android.graphics.BitmapFactory;

import com.chenguang.weather.R;

/**
 * Created by kuwakuzukusunoki on 2017/1/29.
 */

public class BitmapUtil {
    public static int getBirdsResource(int times){
        switch (times % 16){
            case 1:
                return R.mipmap.blue01;
            case 2:
                return R.mipmap.blue02;
            case 3:
                return R.mipmap.blue03;
            case 4:
                return R.mipmap.blue04;
            case 5:
                return R.mipmap.blue05;
            case 6:
                return R.mipmap.blue06;
            case 7:
                return R.mipmap.blue07;
            case 8:
                return R.mipmap.blue08;
            case 9:
                return R.mipmap.blue09;
            case 10:
                return R.mipmap.blue10;
            case 11:
                return R.mipmap.blue11;
            case 12:
                return R.mipmap.blue12;
            case 13:
                return R.mipmap.blue13;
            case 14:
                return R.mipmap.blue14;
            case 15:
                return R.mipmap.blue15;
            case 16:
                return R.mipmap.blue16;
            default:
                return R.mipmap.blue01;
        }
    }
    public static float getBitmapScale(Resources res, int id){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, id, options);
        if (options.outHeight != 0)
            return options.outWidth / options.outHeight;
        return 0;
    }
}
