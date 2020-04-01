package com.chl.systemservices.mapper;

import com.chl.common.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 19:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{

    @Insert("INSERT INTO ns_user (user_name,password,salt,mobile_phone,nick_name,address,status,register_time,register_ip) VALUES "
            +"(#{user.user_name},#{user.password},#{user.salt},#{user.mobile_phone},#{user.nick_name},#{user.address},#{user.status},"
            +"#{user.register_time},#{user.register_ip})")
    User insert(@Param("user") User user);
}
