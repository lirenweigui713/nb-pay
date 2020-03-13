package com.chl.refund;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private DiscoveryClient client;

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        List<ServiceInstance> instances =  client.getInstances("pay");
        return Arrays.toString(instances.toArray());
    }
}
