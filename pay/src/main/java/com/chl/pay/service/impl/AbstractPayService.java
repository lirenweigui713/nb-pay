package com.chl.pay.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.chl.pay.service.PayService;


/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 15:50
 */
public abstract class AbstractPayService implements PayService {

    public static final String PAY_CHANNEL_WECHAT = "WechatPay";
    public static final String PAY_CHANNEL_ALIPAY = "AlipayPay";

    public boolean register(){
        return this.registerChannelService();
    }

    public abstract String getChannel();
   

}
