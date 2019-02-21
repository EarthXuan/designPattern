package com.ex.design.Pattern.strategyPattern;

/**
 * 策略B
 */
public class BStrategy implements Strategy{
    @Override
    public void operate() {
        System.out.println("this is Strategy B");
    }
}
