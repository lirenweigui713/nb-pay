package com.chl.common.service;

import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/1 19:02
 */
public interface RedisService {

    void strSet(Object key, String value, Long time, TimeUnit timeUnit);

    void strSet(Object key,String value);

    Object strGet(Object key);

    <T> T strGet(Object key,Class<T> tClass);


}
