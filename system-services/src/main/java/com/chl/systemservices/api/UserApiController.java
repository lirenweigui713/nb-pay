package com.chl.systemservices.api;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.entity.User;
import com.chl.common.model.Result;
import com.chl.systemservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/28 14:15
 */
@Controller
@RequestMapping("/api/user")
public class UserApiController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public Result login(@RequestBody JSONObject params){
        User user = new User();
        user.setName("xiaoV");
        user.setPassword("pppppppppppp");
        this.userService.login(user);
        return null;
    }
}
