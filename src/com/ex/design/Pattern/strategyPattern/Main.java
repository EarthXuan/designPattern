package com.ex.design.Pattern.strategyPattern;

/**
 * 策略模式
 * 1、先定义一个锦囊，策略接口，策略
 * 2、把策略放入锦囊构造方法中
 * 3、执行锦囊调用策略的方法
 */
public class Main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new AStrategy());
        context.operate();
        context = new Context(new BStrategy());
        context.operate();
        context = new Context(new CStrategy());
        context.operate();
    }
}
