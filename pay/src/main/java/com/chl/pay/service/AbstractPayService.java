package com.chl.pay.service;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.entity.Merchant;
import com.chl.pay.component.ChannelSelector;
import com.chl.pay.model.BasePayRequestModel;
import com.chl.pay.model.PayThreadModel;
import com.chl.pay.model.TransactionModel;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 15:50
 */
public abstract class AbstractPayService implements PayService {

    protected String channel;
    protected boolean registerChannelService;

    protected ThreadLocal<PayThreadModel> threadLocal;



    public boolean register(){
        this.registerChannelService = this.registerChannelService();
        this.setChannle();
        return this.registerChannelService;
    }

    public String getChannel(){
        return this.channel;
    }

    @Override
    public void verifySign(JSONObject params, BasePayRequestModel payLoad) {

        // 参数校验
        // 获取商户信息
        // 验签
        // 转化为Load
    }



}
