package com.chl.pay.component;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 13:26
 */

@Component
public class ChannelSelector {

    @Autowired
    WechatPayComponent wechatPayComponent;
    @Autowired
    AlipayComponent alipayComponent;

    public PayComponent selectComponent(JSONObject params){
        return selectComponent(params.getObject("channle", String.class));
    }

    public PayComponent selectComponent(String channel){
        if("alipay".equals(channel)){
            return this.alipayComponent;
        }else if("wechatpay".equals(channel)){
            return this.wechatPayComponent;
        }else {
            return null;
        }
    }
}
