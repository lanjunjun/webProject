package com.lan.proxy;

/**
 * Created by Administrator on 2016/8/20.
 */
public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Hello! "+name);
    }
}
