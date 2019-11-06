package com.tl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan({"com.tl.config","com.tl.controller"})
public class SpringCloudRibbon {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbon.class,args);
    }
}
