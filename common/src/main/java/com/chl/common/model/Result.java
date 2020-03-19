package com.chl.common.model;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/11 22:04
 */
public class Result {

    public static final Integer OK = 1; // 操作结果成功
    public static final Integer ERROR = 2; // 操作结果失败
    public static final Integer PARAMS_ERROR =3; // 操作出现异常

    /**
     * 支付状态码
     */
    public static final Integer ORDER_CREATE_SUCCESS = 200;
    public static final Integer ORDER_CREATE_FILED = 201;
    public static final Integer ORDER_PAY_SUCCESS = 202;
    public static final Integer ORDER_PAY_WAIT = 203;
    public static final Integer ORDER_PAY_FILED = 204;

    /**
     * 用户登录状态码
     */
    public static final Integer USER_LOGIN_SUCCESS = 300; // 用户登录成功
    public static final Integer USER_LOGIN_FAILED = 301; // 用户登录失败
    public static final Integer USER_LOGIN_STATE_EXPIRE = 302; // 用户的登录状态已过期
    public static final Integer USER_LOGIN_STATE_KEEPING = 303; // 用户登录状态为成功
    public static final Integer USER_LOGIN_STATE_NULL = 304; // 用户登录状态为空，未检测到用户登录

    private String msg; // 业务处理结果信息
    private Integer code; // 业务处理结果码
    private Object att_msg; // 业务处理附加参数 JSON格式
    private boolean success =false; // 操作是否成功

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getAtt_msg() {
        return att_msg;
    }

    public void setAtt_msg(Object att_msg) {
        this.att_msg = att_msg;
    }

    public Result(Integer code, String msg){
        this.msg = msg;
        this.code = code;
    }
    public Result(Integer code, String msg, boolean success){
        this.code = code;
        this.success =success;
        this.msg = msg;
    }
}
