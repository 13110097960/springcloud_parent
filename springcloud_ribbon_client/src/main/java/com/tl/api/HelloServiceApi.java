package com.tl.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloServiceApi {
    @RequestMapping("/hello/hello")
    public String showHello();
}
