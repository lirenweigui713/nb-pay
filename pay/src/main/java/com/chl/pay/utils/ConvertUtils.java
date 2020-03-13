package com.chl.pay.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/11 21:12
 */
public class ConvertUtils {

    public static <T> T paramsToNBPayLoad(JSONObject params,Class<T> clazz){
        T t = JSONObject.toJavaObject(params, clazz);
        return t;
    }



}
