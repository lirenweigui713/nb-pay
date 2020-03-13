package com.chl.pay.load;

import com.chl.pay.common.Result;

import java.math.BigDecimal;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 14:12
 */
public abstract class BasePayRequest {

    protected String merchant_id; // 系统内部商户ID
    protected String time_stamp; // 订单创建时间戳
    protected String order_amount; // 订单原始金额
    protected String sign; // 签名
    protected String sign_type; // 签名类型
    protected String nonce_str; //随机字符串
    protected boolean pass_verify_sign;

    public abstract Result verifySign();

    public abstract Result validParams();

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public boolean isPass_verify_sign() {
        return pass_verify_sign;
    }

    public void setPass_verify_sign(boolean pass_verify_sign) {
        this.pass_verify_sign = pass_verify_sign;
    }
}
