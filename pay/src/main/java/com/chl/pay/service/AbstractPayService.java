package com.chl.pay.service;

import com.alibaba.fastjson.JSONObject;
import com.chl.pay.entity.Merchant;
import com.chl.pay.load.BasePayRequest;
import com.chl.pay.model.TransactionModel;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 15:50
 */
public abstract class AbstractPayService implements PayService {


    protected TransactionModel transactionModel;

    protected Merchant merchant;


    @Override
    public void verifySign(JSONObject params, BasePayRequest payLoad) {
        // 参数校验
        // 获取商户信息
        // 验签
        // 转化为Load
    }

}
