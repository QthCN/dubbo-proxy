package com.bingotree.dubbo.proxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {
    @RequestMapping(value = "/hello")
    public String index() {
        DubboConsumerService dc = ApplicationContextProvider.getApplicationContext().getBean("dubboConsumerService", DubboConsumerService.class);
        System.out.println(dc.getHelloWorld().hello("Hello"));
        return "Hi";
    }
}