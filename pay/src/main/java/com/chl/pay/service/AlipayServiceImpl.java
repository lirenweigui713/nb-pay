package com.chl.pay.service;

import com.chl.common.model.Result;
import com.chl.pay.model.Notify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/19 15:37
 */
@Service
public class AlipayServiceImpl extends AbstractPayService implements AlipayService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public boolean registerChannelService() {
        return false;
    }

    @Override
    public void setChannle() {
        this.channel = "Alipay";
    }

    @Override
    public Result sacnBarcodePay() {
        return null;
    }

    @Override
    public Result qrCodePay() {
        return null;
    }

    @Override
    public Result pcScanPay() {
        return null;
    }

    @Override
    public Result miNiProgramPay() {
        return null;
    }

    @Override
    public Result h5Pay() {
        return null;
    }

    @Override
    public Result appPay() {
        return null;
    }

    @Override
    public Result notification(Notify notify) {
        return null;
    }
}
