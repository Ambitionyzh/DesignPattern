package com.java.factory.pay.impl;

import com.java.factory.pay.Payment;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/8/2 21:16
 */
public class WechatPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付" + amount + "元");
    }
}
