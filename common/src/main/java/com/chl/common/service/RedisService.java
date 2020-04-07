package com.chl.common.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/1 19:02
 */
public interface RedisService {

    // String类型数据操作
    void strSet(Object key, String value, Long time, TimeUnit timeUnit);

    void strSet(Object key,String value);

    void strSet(Object key,String value,Long offset);

    String strGetAndSet(Object key,String value);

    String strGet(Object key);

    <T> T strGet(Object key,Class<T> tClass);

    boolean delete(Object key);

    Long delete(List<String> keys);

    Integer strAppend(Object key,String value);

    Long strSize(Object key);

    // List类型数据操作

    Long listSize(Object key);

    Long leftPush(Object key,Object value);

    Long leftPush(Object key,Object value,Object v);

    Long leftPushAll(Object key,Object... values);

    Long leftPushAll(Object key,List<Object> values);

    Long rightPush(Object key,Object value);

    Long rightPush(Object key,Object value,Object v);

    Long rightPushAll(Object key,Object... values);

    Long rightPushAll(Object key,List<Object> values);

    <T> List<T> listGetAll(Object key);

    <T> List<T> listGet(Object key, long start,long end);

    <T> T listIndex(Object key,long index);

    <T> T listRightPop(Object key);

    <T> T listLeftPop(Object key);

    Object listRemove(Object key);

    public Object listRemove(Object key,long count,Object value);

    // HASH操作

    <T> Map<Object,T> hashEntries(Object key);

    <T> List<T> HashValues(Object key);




}
