package com.chl.pay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO(系统配置中心)
 * @Author: Xiao V
 * @Date: 2020/3/11 15:30
 */
@Component
public class SystemConfig {

    public static String WECHAT_PAY_APPID;

    @Value("${SYSTEM_WECHAT_PAY_APPID}")
    public void setWechatPayAppid(String wechatPayAppid){
        SystemConfig.WECHAT_PAY_APPID = wechatPayAppid;
        System.out.println(SystemConfig.WECHAT_PAY_APPID);
    }
}
