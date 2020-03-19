package com.chl.pay.utils;

import com.chl.common.model.Result;
import com.chl.pay.model.BasePayRequestModel;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * @Description: TODO(验证请求参数是否有效)
 * @Author: Xiao V
 * @Date: 2020/3/12 15:30
 */
public class ParamsValidUtils {

    /**
     * merchant_id; // 系统内部商户ID
     * time_stamp; // 订单创建时间戳
     * order_amount; // 订单原始金额
     * sign; // 签名
     * sign_type; // 签名类型
     * nonce_str; //随机字符串
     * pass_verify_sign;
     * @param request
     * @return
     */
    public static Result commonValidParams(BasePayRequestModel request){
        Integer code;
        String msg;
        boolean success;
        String time_stamp = request.getTime_stamp();
        String order_amount = request.getOrder_amount();
        String sign = request.getSign();
        String sign_type = request.getSign_type();
        String nonce_str = request.getNonce_str();
        BigDecimal bigDecimalOrderAmount = null;
        if(StringUtils.isBlank(time_stamp)||time_stamp.length()!=10){
            return new Result(Result.PARAMS_ERROR,"time_stamp不能为空");
        }
        if(StringUtils.isBlank(order_amount)){
            return new Result(Result.PARAMS_ERROR,"order_amount错误，金额不能为空");
        }
        try{
            bigDecimalOrderAmount=new BigDecimal(order_amount);
        }catch (Exception e){
            return new Result(Result.PARAMS_ERROR,"order_amount格式错误");
        }
        if(bigDecimalOrderAmount.compareTo(new BigDecimal(0))<=0){
            return new Result(Result.PARAMS_ERROR,"order_amount金额错误，金额必须>0");
        }
        if(StringUtils.isBlank(sign)){
            return new Result(Result.PARAMS_ERROR,"sign不能为空");
        }
        if(StringUtils.isBlank(sign_type)){
            return new Result(Result.PARAMS_ERROR,"sign_type不能为空");
        }
        if(StringUtils.isBlank(nonce_str)){
            return new Result(Result.PARAMS_ERROR,"nonce_str不能为空且长度必须为10位");
        }
        return null;
    }


}
