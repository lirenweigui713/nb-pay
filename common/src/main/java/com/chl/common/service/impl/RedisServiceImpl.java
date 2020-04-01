package com.chl.common.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/1 19:02
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Override
    public void strSet(Object key, String value, Long time, TimeUnit timeUnit) {
        if(time==null){
            this.stringRedisTemplate.opsForValue().set(key.toString(),value);
        }else{
            this.stringRedisTemplate.opsForValue().set(key.toString(),value,time,timeUnit);
        }
    }

    @Override
    public void strSet(Object key, String value) {
        this.strSet(key,value,null,null);
    }

    @Override
    public Object strGet(Object key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public <T> T strGet(Object key, Class<T> tClass) {
        String value = this.stringRedisTemplate.opsForValue().get(key);
        return JSONObject.parseObject(value, tClass);
    }
}
