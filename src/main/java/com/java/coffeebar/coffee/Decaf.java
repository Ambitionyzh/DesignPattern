package com.java.coffeebar.coffee;

import com.java.coffeebar.Drink;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/5 9:38
 */
public class Decaf extends Coffee {
    public Decaf(){
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
