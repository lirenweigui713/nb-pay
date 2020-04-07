package com.chl.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/7 17:19
 */
@Configuration
public class RedisMessageListenerAdapter{

    @Autowired
    RedisReceiver redisReceiver;

    @Bean
    RedisMessageListenerContainer listenerContainer(RedisConnectionFactory redisConnectionFactory){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(redisConnectionFactory);
        redisReceiver.register(container);
        // 添加接收适配器
        return container;
    }

    @Bean
    public MessageListenerAdapter messageListenerAdapter(){
        MessageListenerAdapter adapter = new MessageListenerAdapter(redisReceiver,redisReceiver.getMethod());
        return adapter;
    }


}
