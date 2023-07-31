package com.java.Strategy.reward.v1;


import com.java.Strategy.reward.request.FoodRequest;
import com.java.Strategy.reward.request.HotelRequest;
import com.java.Strategy.reward.request.WaimaiRequest;
import com.java.Strategy.reward.service.FoodService;
import com.java.Strategy.reward.service.HotelService;
import com.java.Strategy.reward.service.WaimaiService;
import com.java.Strategy.reward.v2.Strategy;
import com.java.Strategy.reward.v2.StrategyContext;
import com.java.Strategy.reward.v3.StrategyContextV3;

public class RewardService {
    // 外部服务
    private WaimaiService waimaiService;
    private HotelService hotelService;
    private FoodService foodService;

    public RewardService() {
        this.waimaiService = new WaimaiService();
        this.hotelService = new HotelService();
        this.foodService = new FoodService();
    }

    // 使用对入参的条件判断进行发奖
    public void issueRewardV1(String rewardType, Object... params) {
        if ("Waimai".equals(rewardType)) {
            WaimaiRequest request = new WaimaiRequest();
            // 构建入参
            request.setWaimaiReq(params);
            waimaiService.issueWaimai(request);
        } else if ("Hotel".equals(rewardType)) {
            HotelRequest request = new HotelRequest();
            request.addHotelReq(params);
            hotelService.sendPrize(request);
        } else if ("Food".equals(rewardType)) {
            FoodRequest request = new FoodRequest(params);
            foodService.getCoupon(request);
        } else {
            throw new IllegalArgumentException("rewardType error!");
        }
    }

    public void issueRewardV2(String rewardType, Object... params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }

    public void issueRewardV3(String rewardType, Object... params) {
        Strategy strategy = StrategyContextV3.getStrategy(rewardType);
        strategy.issue(params);
    }
}
