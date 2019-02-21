package com.ex.design.Pattern.proxyPattern.dynamicProxy;

/**
 * 被代理人C
 */
public class BeProxyC implements ProxyInterface{
    @Override
    public void doSomething() {
        System.out.println("C doSomething");
    }

    @Override
    public void saySomething() {
        System.out.println("C saySomething");
    }
}
