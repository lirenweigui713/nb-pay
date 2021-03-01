package com.chl.pay.controller;

import com.chl.common.model.Result;
import com.chl.pay.component.ChannelSelector;
import com.chl.pay.payload.BarcodePayRequestPayload;
import com.chl.pay.service.PayService;
import com.chl.pay.component.SafetyInspection;
import com.chl.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


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

    @Autowired
    SafetyInspection safetyInspection;


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
    @RequestMapping("/barcode")
    public Result scanBarcodePay(BarcodePayRequestPayload payLoad, HttpServletRequest request){

        // 请求安全检测
        Result result = safetyInspection.safetyInspectionByBarcode(payLoad);
        if(!result.isSuccess()) return result;
        // 选择支付渠道
        PayService payService =channelSelector.selectPayServiceByBarcode(payLoad);

        payService.sacnBarcodePay();
        System.out.println("log..xxxxxxxx...xxx.xxxxxxx`");

        // 参数校验
        // 验签
        // 渠道
        // 发起支付
        return result;
    }


}
