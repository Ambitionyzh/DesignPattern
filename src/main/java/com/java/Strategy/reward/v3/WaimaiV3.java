package com.java.Strategy.reward.v3;


import com.java.Strategy.reward.request.WaimaiRequest;
import com.java.Strategy.reward.service.WaimaiService;
import com.java.Strategy.reward.v2.Strategy;

public class WaimaiV3 extends AbstractStrategy implements Strategy {
    private static final WaimaiV3 instance = new WaimaiV3();
    private WaimaiService waimaiService;

    private WaimaiV3() {
        this.waimaiService = new WaimaiService();
        register();
    }

    public static WaimaiV3 getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        WaimaiRequest request = new WaimaiRequest();
        // 构建入参
        request.setWaimaiReq(params);
        waimaiService.issueWaimai(request);
    }
}
