package com.ex.design.Pattern.proxypattern.dynamicProxy;

/**
 * 动态代理
 */
public class Main {
    public static void main(String[] args) {
        ProxyHandler proxyHandler=new ProxyHandler();
        ProxyInterface proxyInterface=(ProxyInterface)proxyHandler.bind(new BeProxyA());
        proxyInterface.doSomething();
        proxyInterface.saySomething();
    }
}
