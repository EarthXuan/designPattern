package com.ex.design.Pattern.singletonPattern;

/**
 * 静态内部类实现
 */
public class StaticSingleton {
    private static class SingletonExamlpe{
        private static StaticSingleton INSTANCE=new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonExamlpe.INSTANCE;
    }
}
