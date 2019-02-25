package com.ex.design.Pattern.singletonPattern;

/**
 * 懒汉实现
 */
public class LazySingleton {
    public LazySingleton() {}
    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
