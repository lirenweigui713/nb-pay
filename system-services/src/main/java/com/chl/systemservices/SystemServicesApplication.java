package com.chl.systemservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaClient
@ComponentScan(basePackages = {"com.chl"})
public class SystemServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemServicesApplication.class, args);
    }





}
