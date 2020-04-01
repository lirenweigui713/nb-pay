package com.chl.systemservices.service;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.entity.User;
import com.chl.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/28 14:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RedisService redisService;

    @Override
    public int login(User user) {
        this.redisService.strSet("person1", JSONObject.toJSONString(user));
        User user1 = this.redisService.strGet("person1", User.class);
        System.out.println(user1.getName());
        return 0;
    }
}
