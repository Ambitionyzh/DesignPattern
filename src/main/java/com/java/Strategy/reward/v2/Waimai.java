package com.java.Strategy.reward.v2;


import com.java.Strategy.reward.request.WaimaiRequest;
import com.java.Strategy.reward.service.WaimaiService;

class Waimai implements Strategy {
    private WaimaiService waimaiService;

    public Waimai() {
        this.waimaiService = new WaimaiService();
    }

    @Override
    public void issue(Object... params) {
        WaimaiRequest request = new WaimaiRequest();
        // 构建入参
        request.setWaimaiReq(params);
        waimaiService.issueWaimai(request);
    }
}
