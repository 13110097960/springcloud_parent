package com.tl.controller;


import com.tl.api.HelloServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("show")
public class ShowHelloController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HelloServiceApi helloServiceApi;
    @RequestMapping("hello")
    public String showHello(){
        /*String forObject = restTemplate.getForObject("http://hello-service/hello/hello", String.class);
        return forObject;*/
       return  helloServiceApi.showHello();
    }
}
