package com.chl.pay.component;

import com.alibaba.fastjson.JSONObject;
import com.chl.pay.payload.BarcodePayRequestPayload;
import com.chl.pay.service.impl.AbstractPayService;
import com.chl.pay.service.PayService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 13:26
 */

@Component
public class ChannelSelector implements BeanPostProcessor,ApplicationContextAware {


    private Map<String, String> channelServices = new HashMap<>();
    private ApplicationContext applicationContext;

    private static List<String> alipayBarcodeHeader = new ArrayList<>();
    private static List<String> wechatBarcodeHeader = new ArrayList<>();

    static{
        String [] a ={"25","26","27","28","29","30"};
        String [] w = {"10","11","12","13","14","15"};
        alipayBarcodeHeader = Arrays.asList(a);
        wechatBarcodeHeader = Arrays.asList(w);
    }

    public PayService select(JSONObject params){
        return select(params.getObject("channel", String.class));
    }

    public PayService select(String channel){
        String s = this.channelServices.get(channel);
        return (PayService) applicationContext.getBean(s);
    }

    public PayService selectPayServiceByBarcode(BarcodePayRequestPayload payload){
        String barcodeHeader = payload.getBarcode().substring(0,2);
        payload.setChannel(alipayBarcodeHeader.contains(barcodeHeader)? "Alipay" : "WechatPay");
        return (PayService) applicationContext.getBean(channelServices.get(payload.getChannel()));

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof AbstractPayService){
            if(((AbstractPayService) bean).register()){
                channelServices.put(((AbstractPayService) bean).getChannel(),beanName);
            }
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
