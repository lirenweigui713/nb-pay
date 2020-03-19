package com.chl.pay.controller;

import com.alibaba.fastjson.JSONObject;
import com.chl.common.model.Result;
import com.chl.pay.component.ChannelSelector;
import com.chl.pay.config.SystemConfig;
import com.chl.pay.model.WechatPayBarcodeRequestModel;
import com.chl.pay.service.AbstractPayService;
import com.chl.pay.service.PayService;
import com.chl.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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

    @Autowired
    UserService userService;


   /**
    *
    * @Author:Xiao V
    * @Time:2020/3/11 22:16
    *
    */
    @RequestMapping("/qrcode")
    public String scanQRCode(String merchantId,String sign){
//        List<ServiceInstance> instances = discoveryClient.getInstances("power-1");
//        ServiceInstance serviceInstance = instances.get(0);
//        System.out.println(JSONObject.toJSONString(serviceInstance));

        // 去redis中取merchant信息，查询到使用 查询不到去数据库中查询
        return null;
    }
    /**
     * @Author:Xiao V
     * @Time:2020/3/11 22:14
     *
     *
     */
    @ResponseBody
    @PostMapping("/barcode")
    public Result scanBarcodePay(@RequestBody JSONObject params, HttpServletRequest request){
        Result result = userService.loginState();
        // 验证商户登录信息
        if(!Result.USER_LOGIN_STATE_KEEPING.equals(result.getCode()))
            return result;
        AbstractPayService payService = (AbstractPayService)channelSelector.select(params);
        payService.verifySign(params,new WechatPayBarcodeRequestModel());



        // 参数验证
        // 验签

        // 渠道
        // 发起支付


        return null;
    }


}
