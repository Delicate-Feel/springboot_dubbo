package com.dubbo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0",timeout = 300)
    private TestService testService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        System.out.println("name=="+name);
        System.out.println("testService=="+testService);
        return testService.sayHello(name);
    }





}
