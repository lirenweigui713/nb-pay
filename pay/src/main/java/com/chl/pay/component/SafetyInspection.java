package com.chl.pay.component;

import com.chl.common.model.Result;
import com.chl.pay.payload.BarcodePayRequestPayload;
import com.chl.pay.payload.OnlinePayRequestPayLoad;
import com.chl.pay.payload.RequestPayLoad;
import com.chl.pay.service.UserService;
import com.chl.pay.utils.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SafetyInspection {

    @Autowired
    UserService userService;

    public Result safetyInspectionByBarcode(BarcodePayRequestPayload payLoad) {
        // 登陆认证
        Result result  = userService.loginState();
        // 签名验证
        SignUtil.checkByBarcode(payLoad);
        // 参数校验  金额  条码
        String order_amount = payLoad.getOrder_amount();
        return result;
    }

    public Result safetyInspectionByOnline(OnlinePayRequestPayLoad payLoad) {
        // 登陆认证
        Result result  = SignUtil.checkByOnline(payLoad);
        // 签名验证

        // 参数校验  金额  条码
//        String order_amount = payLoad.getOrder_amount();
        return result;
    }

}
