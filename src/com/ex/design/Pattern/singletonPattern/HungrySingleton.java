package com.ex.design.Pattern.singletonPattern;

/**
 * 饿汉实现
 */
public class HungrySingleton {
    public HungrySingleton() {}
    private static HungrySingleton hungrySingleton=new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
