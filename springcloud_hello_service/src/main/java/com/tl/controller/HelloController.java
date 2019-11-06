package com.tl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "<html><font color='blue'>hello,this is my first springcloud process</font></html>";
    }
}
