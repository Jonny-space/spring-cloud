package com.springcloud.jonny.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-1")
public interface ScheduleService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);

}
