package com.ex.design.Pattern.strategyPattern;

/**
 * 策略A
 */
public class AStrategy implements Strategy{
    @Override
    public void operate() {
        System.out.println("this is Strategy A");
    }
}
