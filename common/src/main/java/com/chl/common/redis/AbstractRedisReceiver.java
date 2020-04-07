package com.chl.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import javax.annotation.PostConstruct;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/7 16:48
 */
public abstract class AbstractRedisReceiver implements RedisReceiver {

    public static final String DEFAULT_METHOD = "receiveMessage";

    @Autowired
    public MessageListenerAdapter messageListenerAdapter;

    @Override
    public void receiveMessage(String message) {
        this.handlerMessage(message);
    }

    public abstract void handlerMessage(String message);



}
