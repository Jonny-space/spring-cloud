package com.springcloud.jonny.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hi")
    public String sayHello(@RequestParam String name){
        return  "hi " + name + ",i am from port:" + port;
    }
}
