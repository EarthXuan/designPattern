package com.ex.design.Pattern.proxypattern.staticProxy;

/**
 * 代理模式
 * 1、先定义代理接口（提供给代理人和被代理人实现）
 * 2、定义代理人，定义被代理人
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----默认代理-----");
        ProxyMan proxyMan =new ProxyMan();
        proxyMan.doSomething();
        proxyMan.saySomething();
        System.out.println("-----代理A-----");
        proxyMan =new ProxyMan(new BeProxyA());
        proxyMan.doSomething();
        proxyMan.saySomething();
        System.out.println("-----代理B-----");
        proxyMan =new ProxyMan(new BeProxyB());
        proxyMan.doSomething();
        proxyMan.saySomething();
        System.out.println("-----代理C-----");
        proxyMan =new ProxyMan(new BeProxyC());
        proxyMan.doSomething();
        proxyMan.saySomething();
    }
}
