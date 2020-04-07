package com.chl.common.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.entity.User;
import com.chl.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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
    public void strSet(Object key, String value, Long offset) {
        this.stringRedisTemplate.opsForValue().set(key.toString(),value,offset);
    }

    @Override
    public String strGetAndSet(Object key, String value) {
        return this.stringRedisTemplate.opsForValue().getAndSet(key.toString(),value);
    }

    @Override
    public String strGet(Object key) {
        return this.stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public <T> T strGet(Object key, Class<T> tClass) {
        return JSONObject.parseObject(strGet(key), tClass);
    }

    @Override
    public boolean delete(Object key) {
        return this.redisTemplate.delete(key);
    }

    @Override
    public Long delete(List<String> keys) {
        return this.redisTemplate.delete(keys);
    }

    @Override
    public Integer strAppend(Object key, String value) {
        return this.stringRedisTemplate.opsForValue().append(key.toString(),value);
    }

    @Override
    public Long strSize(Object key) {
        return this.stringRedisTemplate.opsForValue().size(key.toString());
    }


    @Override
    public Long listSize(Object key) {
        return this.redisTemplate.opsForList().size(key);
    }

    @Override
    public Long leftPush(Object key, Object value) {
        return this.redisTemplate.opsForList().leftPush(key,value);
    }

    @Override
    public Long leftPush(Object key, Object pivot, Object value) {
        return this.redisTemplate.opsForList().leftPush(key,pivot,value);
    }

    @Override
    public Long leftPushAll(Object key,Object... values){
        return this.redisTemplate.opsForList().leftPushAll(key,values);
    }

    @Override
    public Long leftPushAll(Object key, List<Object> values) {
        return this.redisTemplate.opsForList().leftPushAll(key,values);
    }

    @Override
    public Long rightPush(Object key, Object value) {
        return this.redisTemplate.opsForList().rightPush(key,value);
    }

    @Override
    public Long rightPush(Object key, Object pivot, Object value) {
        return this.redisTemplate.opsForList().rightPush(key,pivot,value);
    }

    @Override
    public Long rightPushAll(Object key,Object... values){
        return this.redisTemplate.opsForList().rightPushAll(key,values);
    }

    @Override
    public Long rightPushAll(Object key, List<Object> values) {
        return this.redisTemplate.opsForList().rightPushAll(key,values);
    }

    @Override
    public <T> List<T> listGet(Object key, long start,long end) {
        return this.redisTemplate.opsForList().range(key, start, end);
    }

    @Override
    public <T> List<T> listGetAll(Object key) {
        return listGet(key, 0l, -1l);
    }

    @Override
    public <T> T listIndex(Object key, long index) {
        Object v = this.redisTemplate.opsForList().index(key, index);
        if(null==v)return null;
        return (T) v;
    }

    @Override
    public <T> T listRightPop(Object key) {
        Object v = this.redisTemplate.opsForList().rightPop(key);
        if(v==null)return null;
        return (T) v;
    }

    @Override
    public <T> T listLeftPop(Object key) {
        Object v = this.redisTemplate.opsForList().leftPop(key);
        if(v==null)return null;
        return (T) v;
    }

    /**
     * 从存储在键中的列表中删除等于值的元素的第一个计数事件。
     * 计数参数以下列方式影响操作：
     * count> 0：删除等于从头到尾移动的值的元素。
     * count <0：删除等于从尾到头移动的值的元素。
     * count = 0：删除等于value的所有元素。
     * @return
     */
    @Override
    public Object listRemove(Object key) {
        return listRemove(key,-1,null);
    }

    @Override
    public Object listRemove(Object key,long count,Object value){
        return this.redisTemplate.opsForList().remove(key,count,value);
    }

    @Override
    public <T> Map<Object, T> hashEntries(Object key) {
        return this.redisTemplate.opsForHash().entries(key);
    }

    @Override
    public <T> List<T> HashValues(Object key) {
        return this.redisTemplate.opsForHash().values(key);
    }
}
