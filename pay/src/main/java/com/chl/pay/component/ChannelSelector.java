package com.chl.pay.component;

import com.alibaba.fastjson.JSONObject;
import com.chl.pay.service.AbstractPayService;
import com.chl.pay.service.PayService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 13:26
 */

@Component
@Scope("singleton")
public class ChannelSelector implements BeanPostProcessor,ApplicationContextAware {

    private Map<String, String> channleServices = new HashMap<>();

    private ApplicationContext applicationContext;

    public PayService select(JSONObject params){
        return select(params.getObject("channel", String.class));
    }

    public PayService select(String channel){
        String s = this.channleServices.get(channel);
        return (PayService) applicationContext.getBean(s);
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof AbstractPayService){
            if(((AbstractPayService) bean).register()){
                channleServices.put(((AbstractPayService) bean).getChannel(),beanName);
            }
            System.out.println(((AbstractPayService) bean).getChannel());
        }
        return null;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
