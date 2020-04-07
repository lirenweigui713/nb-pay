package com.chl.common.redis;

import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/7 13:18
 */
public interface RedisReceiver {

    public void receiveMessage(String message);

    public void register(RedisMessageListenerContainer redisMessageListenerContainer);

    public String getMethod();

}
