package com.lan.proxy;

/**
 * Created by Administrator on 2016/8/20.
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy(){
        hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before(){
        System.out.println("Before");
    }

    private void after(){
        System.out.println("after");
    }
}
