package com.java.Strategy.reward.v2;


import com.java.Strategy.reward.request.FoodRequest;
import com.java.Strategy.reward.service.FoodService;

class Food implements Strategy {
    private FoodService foodService;

    public Food() {
        this.foodService = new FoodService();
    }

    @Override
    public void issue(Object... params) {
        FoodRequest request = new FoodRequest(params);
        foodService.payCoupon(request);
    }
}
