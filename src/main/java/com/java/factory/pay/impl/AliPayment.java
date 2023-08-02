package com.java.factory.pay.impl;

import com.java.factory.pay.Payment;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/8/2 21:18
 */
public class AliPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付" + amount + "元");
    }
}
