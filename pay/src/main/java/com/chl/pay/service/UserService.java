package com.chl.pay.service;

import com.chl.common.model.Result;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/16 12:12
 */
@Transactional
public interface UserService {

    /**
     * 登录
     * @Author:Xiao V
     * @Time:2020/3/16 12:12
     *
     */
    Result login();

    /**
     * 用户登录状态
     * 去用户服务获取
     * @Author:Xiao V
     * @Time:2020/3/16 12:13
     *
     */
    Result loginState();

    /**
     * 用户退出登录
     * @Author:Xiao V
     * @Time:2020/3/16 12:14
     *
     */
    Result logout();

}
