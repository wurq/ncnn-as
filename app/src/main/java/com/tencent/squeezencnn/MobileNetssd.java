package com.tencent.squeezencnn;

import android.graphics.Bitmap;

/**
 * Created by wurongqiu on 2019/1/5.
 */

class MobileNetssd {
    public native boolean Init(byte[] param, byte[] bin); // 初始化函数
    public native float[] Detect(Bitmap bitmap); // 检测函数
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("MobileNetssd");
    }
}
