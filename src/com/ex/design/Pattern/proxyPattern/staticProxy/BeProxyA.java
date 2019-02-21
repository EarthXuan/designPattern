package com.ex.design.Pattern.proxyPattern.staticProxy;

/**
 * 被代理人A
 */
public class BeProxyA implements ProxyInterface{
    @Override
    public void doSomething() {
        System.out.println("A doSomething");
    }

    @Override
    public void saySomething() {
        System.out.println("A saySomething");
    }
}
