package com.chl.pay.load;

import com.chl.pay.common.Result;
import com.chl.pay.utils.ParamsValidUtils;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 14:56
 */
public class WechatPayBarcodeRequest extends BasePayRequest {


    private String auth_code;

    @Override
    public Result verifySign() {
        return null;
    }

    @Override
    public Result validParams() {
        Result result = ParamsValidUtils.commonValidParams(this);
        if(!result.isSuccess()){
            return result;
        }

        return result;
    }

}
