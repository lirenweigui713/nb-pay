package com.chl.common.config;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * TODO：处理视频.（1.将视频提取成帧图片）
 *
 * @author ChenP
 */


/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/4/1 19:52
 */
@Configuration
public class CommonConfig {

//    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
