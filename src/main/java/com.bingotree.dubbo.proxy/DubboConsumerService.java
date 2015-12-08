package com.bingotree.dubbo.proxy;

import com.treebingo.dubbo.third.facada.HelloWorld;


public class DubboConsumerService {

    public HelloWorld helloWorld;

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }

}
