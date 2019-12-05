package com.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.TestService;

@Service(version = "1.0.0",timeout = 3000)
 public class TestServiceImpl  implements TestService {

   //通过执行以上操作，虽然在IDEA中没问题了，但是当我将dubbo-customer打成jar放到其它机器上运行时，又报错了，调试发现这里
    //的testService为null,
    @Override
     public String sayHello(String name) {
        return "哈哈哈，hello "+name;
    }
}
