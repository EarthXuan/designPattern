package com.ex.design.Pattern.proxyPattern.staticProxy;

/**
 * 代理人
 */
public class ProxyMan implements ProxyInterface{
    private ProxyInterface proxyInterface;

    //默认代理A
    public ProxyMan() {
        this.proxyInterface = new BeProxyA();
    }

    public ProxyMan(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void doSomething() {
        proxyInterface.doSomething();
    }

    @Override
    public void saySomething() {
        proxyInterface.saySomething();
    }
}
