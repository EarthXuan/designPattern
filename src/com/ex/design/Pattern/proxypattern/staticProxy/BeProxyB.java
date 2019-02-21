package com.ex.design.Pattern.proxypattern.staticProxy;

/**
 * 被代理人B
 */
public class BeProxyB implements ProxyInterface{
    @Override
    public void doSomething() {
        System.out.println("B doSomething");
    }

    @Override
    public void saySomething() {
        System.out.println("B saySomething");
    }
}
