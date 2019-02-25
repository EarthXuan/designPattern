package com.ex.design.Pattern.singletonPattern;

/**
 * 枚举实现
 */
public class EnumSingleton {
    public EnumSingleton() {}

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}
