package com.java.Strategy.reward.v3;


import com.java.Strategy.reward.v2.Strategy;

public abstract class AbstractStrategy implements Strategy {
    // 类注册方法
    public void register() {
        StrategyContextV3.registerStrategy(getClass().getSimpleName(), this);
    }
}
