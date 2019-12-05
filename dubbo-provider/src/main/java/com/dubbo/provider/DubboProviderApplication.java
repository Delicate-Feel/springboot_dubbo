package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@RestController
public class DubboProviderApplication {

    @RequestMapping("/")
    public String index(){
        System.out.println("Hello Spring Boot");
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
        System.out.println("服务已启动...");
    }

}
