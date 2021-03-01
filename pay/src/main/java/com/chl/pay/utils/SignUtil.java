package com.chl.pay.utils;

import com.chl.common.model.Result;
import com.chl.pay.payload.BarcodePayRequestPayload;
import com.chl.pay.payload.OnlinePayRequestPayLoad;

public class SignUtil {

    /**
     * 签名算法 非空集合按照ASCII码表进行排序，使用键值对格式拼接城字符串：
     *      参数值为空不参与，从小到大排序，参数命区分大小写，sign参数不参与签名
     *      最后得到得字符串拼接上&key=key值
     */

    public static Result checkByBarcode(BarcodePayRequestPayload payload){
        Result result = new Result(Result.OK,true);
        return result;
    }

    public static Result checkByOnline(OnlinePayRequestPayLoad payload){
        Result result = new Result(Result.OK,true);
        return result;
    }
}
