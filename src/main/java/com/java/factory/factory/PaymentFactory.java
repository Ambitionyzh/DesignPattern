package com.java.factory.factory;

import com.java.factory.pay.Payment;

/**
 * @author yongzh
 * @version 1.0
 * @description: TODO
 * @date 2023/8/2 21:19
 */
public interface PaymentFactory {
    Payment getPayment(String type);
}
