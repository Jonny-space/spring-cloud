package com.springcloud.jonny.servicefeign.controller;


import com.springcloud.jonny.servicefeign.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @Autowired
    ScheduleService  scheduleService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return scheduleService.sayHelloFromClientOne(name);
    }
}
