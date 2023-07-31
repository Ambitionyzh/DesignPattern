package com.java.Strategy.reward.v2;


import com.java.Strategy.reward.request.HotelRequest;
import com.java.Strategy.reward.service.HotelService;

class Hotel implements Strategy {
    private HotelService hotelService;

    public Hotel() {
        this.hotelService = new HotelService();
    }

    @Override
    public void issue(Object... params) {
        HotelRequest request = new HotelRequest();
        request.addHotelReq(params);
        hotelService.sendPrize(request);
    }
}
