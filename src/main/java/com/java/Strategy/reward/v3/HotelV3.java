package com.java.Strategy.reward.v3;


import com.java.Strategy.reward.request.HotelRequest;
import com.java.Strategy.reward.service.HotelService;
import com.java.Strategy.reward.v2.Strategy;

public class HotelV3 extends AbstractStrategy implements Strategy {
    private static final HotelV3 instance = new HotelV3();
    private HotelService hotelService;

    private HotelV3() {
        this.hotelService = new HotelService();
        register();
    }

    public static HotelV3 getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        HotelRequest request = new HotelRequest();
        request.addHotelReq(params);
        hotelService.sendPrize(request);
    }
}
