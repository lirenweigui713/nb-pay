package com.chl.pay.component;

import com.chl.common.model.Result;
import com.chl.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Description: TODO(UserAPI调用服务组件)
 * @Author: Xiao V
 * @Date: 2020/3/19 13:42
 */
@Component
public class UserApiComponent {

    @Autowired
    UserService userService;

    public Result loginState(){
        return null;
    }
}
