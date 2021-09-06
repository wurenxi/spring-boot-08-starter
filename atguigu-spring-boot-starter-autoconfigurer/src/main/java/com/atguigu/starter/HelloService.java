package com.atguigu.starter;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/9/6 17:48
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloAtguigu(String name){
        return helloProperties.getPrefix() + "-"
                + name + helloProperties.getSuffix();
    }
}
