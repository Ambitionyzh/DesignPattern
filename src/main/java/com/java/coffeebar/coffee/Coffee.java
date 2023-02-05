package com.java.coffeebar.coffee;

import com.java.coffeebar.Drink;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 咖啡父类
 * @date 2023/2/5 9:37
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
