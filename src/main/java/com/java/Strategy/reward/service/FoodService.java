package com.java.Strategy.reward.service;

import com.java.Strategy.reward.request.FoodRequest;

import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public void getCoupon(FoodRequest request) {
        System.out.println("获得优惠券");
    }

    public void payCoupon(FoodRequest request) {
        System.out.println("支付优惠券");
    }
}
