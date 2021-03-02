package com.hualong.meituan.util;

import android.util.Log;

import com.blankj.utilcode.util.StringUtils;

public class LogUtil {
    public static final String LOG_NAME = "hualong";

    public static void d(String ...msg){
        if(msg == null || msg.length == 0){
            Log.d(LOG_NAME,"null");
            return;
        }
        StringBuffer sb = new StringBuffer();
        for(String str : msg){
            sb.append(str).append(",");
        }
        Log.d(LOG_NAME,sb.toString().substring(0,sb.length()-1));
    }
}
