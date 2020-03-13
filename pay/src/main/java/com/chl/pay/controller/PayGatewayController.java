package com.chl.pay.controller;

import com.alibaba.fastjson.JSONObject;
import com.chl.pay.component.ChannelSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author:Xiao V
 * @Time:2020/3/11 13:25
 * NB Pay 商户版支付统一入口
 */
@Controller
@RequestMapping("/order/create")
public class PayGatewayController {

    @Autowired
    ChannelSelector channelSelector;


   /**
    *
    * @Author:Xiao V
    * @Time:2020/3/11 22:16
    *
    */
    @RequestMapping("/qrcode")
    public String scanQRCode(String merchantId,String sign){

        // 去redis中取merchant信息，查询到使用 查询不到去数据库中查询
        return null;
    }
    /**
     * @Author:Xiao V
     * @Time:2020/3/11 22:14
     *
     *
     */
    @RequestMapping("/barcode")
    public String scanBarcodePay(@RequestBody JSONObject params){



        // 验证商户登录信息
        // 参数验证
        // 验签

        // 渠道
        // 发起支付


        return null;
    }


}
