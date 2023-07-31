package com.java.Strategy.reward.service;


import com.java.Strategy.reward.request.HotelRequest;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    public void sendPrize(HotelRequest request) {
        System.out.println("发奖品");
    }
}
