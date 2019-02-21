package com.ex.design.Pattern.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现InvocationHandler接口
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;

    //绑定委托对象，并返回代理类
    public Object bind(Object object)
    {
        this.object = object;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        Object result = method.invoke(object,args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}
