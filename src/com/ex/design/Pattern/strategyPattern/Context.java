package com.ex.design.Pattern.strategyPattern;

/**
 * 锦囊，包含策略
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
