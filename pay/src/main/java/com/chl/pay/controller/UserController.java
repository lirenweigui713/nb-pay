package com.chl.pay.controller;

import com.chl.common.entity.User;
import com.chl.common.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO(用户API)
 * @Author: Xiao V
 * @Date: 2020/3/16 12:07
 */
@Controller
@RequestMapping("/api/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/login")
    public Result login(User user){

        return null;
    }

}
