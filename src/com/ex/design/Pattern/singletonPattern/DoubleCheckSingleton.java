package com.ex.design.Pattern.singletonPattern;

/**
 * 双检锁实现
 */
public class DoubleCheckSingleton {
    //声明静态的单例对象变量
    //在jmm中，每次实例化对象的时候会有3个步骤，1、分配对象的内存空间；2、初始化对象；3、将引用指向内存地址
    //volatile是防止new DoubleCheckSingleton时重排序，假如没有volatile，则2和3会有可能互换执行顺序，会导致先指向内存地址，
    //此时还没有初始化对象，第二个线程在执行第二个if(doubleCheckSingleton==null)就会被通过，导致非线程安全
    private static volatile DoubleCheckSingleton doubleCheckSingleton;
    //构造方法
    private DoubleCheckSingleton(){};
    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton==null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton==null){
                    doubleCheckSingleton= new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
