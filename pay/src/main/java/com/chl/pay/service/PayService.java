package com.chl.pay.service;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.model.Result;
import com.chl.pay.model.Notify;
import com.chl.pay.payload.RequestPayLoad;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/12 15:49
 */
public interface PayService {


    /**
     * 是否注册为渠道支付服务
     * @Author:Xiao V
     * @Time:2020/3/19 14:24
     *
     */
    public boolean registerChannelService();

    /**
     * 付款码支付
     * @Author:Xiao V
     * @Time:2020/3/12 13:45
     *
     */
    public Result sacnBarcodePay();

    /**
     * 手机扫码聚合支付
     * @Author:Xiao V
     * @Time:2020/3/12 13:45
     *
     */
    public Result qrCodePay();

    /**
     * 手机扫电脑浏览器二维码支付(电商网站扫码)
     * @Author:Xiao V
     * @Time:2020/3/12 13:47
     *
     */
    public Result pcScanPay();

    /**
     * 小程序支付
     * @Author:Xiao V
     * @Time:2020/3/12 13:48
     *
     */
    public Result miNiProgramPay();

    /**
     * H5支付 （手机浏览器调起支付渠道支付）
     * @Author:Xiao V
     * @Time:2020/3/12 13:50
     *
     */
    public Result h5Pay();

    /**
     * App支付(调用支付渠道SDK拉起支付)
     * @Author:Xiao V
     * @Time:2020/3/12 13:51
     *
     */
    public Result appPay();

    /**
     * 接收/处理渠道异步支付通知
     * @Author:Xiao V
     * @Time:2020/3/12 16:01
     *
     */
    public Result notification(Notify notify);





}
