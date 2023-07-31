package com.java.Strategy.reward.v3;


import com.java.Strategy.reward.request.FoodRequest;
import com.java.Strategy.reward.service.FoodService;
import com.java.Strategy.reward.v2.Strategy;

public class FoodV3 extends AbstractStrategy implements Strategy {
    private static final FoodV3 instance = new FoodV3();
    private FoodService foodService;

    private FoodV3() {
        this.foodService = new FoodService();
        register();
    }

    public static FoodV3 getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        FoodRequest request = new FoodRequest(params);
        foodService.payCoupon(request);
    }
}
