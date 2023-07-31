package com.java.Strategy.reward.v2;

public class StrategyContext {
    public static Strategy getStrategy(String rewardType) {
        switch (rewardType) {
            case "Waimai":
                return new Waimai();
            case "Hotel":
                return new Hotel();
            case "Food":
                return new Food();
            default:
                throw new IllegalArgumentException("rewardType error!");
        }
    }
}
