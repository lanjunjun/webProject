package com.lan.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/8/20.
 */
public class Test {

    public static void main(String[] args){
        /*Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");*/

        /*DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
        Hello helloProxy = dynamicProxy.getProxy();*/

        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");

    }
}
