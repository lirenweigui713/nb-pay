package com.chl.systemservices;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.entity.User;
import com.chl.common.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.chl")
public class SystemServicesApplicationTests {


    @Autowired
    RedisService redisService;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("chl");
        user.setPassword("hhhhhhhh");

        this.redisService.strSet("person1", JSONObject.toJSONString(user));
        User user1 = this.redisService.strGet("person1", User.class);
        System.out.println(user1.getName());
    }

}
