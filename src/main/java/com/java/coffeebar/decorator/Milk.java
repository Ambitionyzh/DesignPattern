package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 牛奶
 * @date 2023/2/5 9:47
 */
public class Milk extends Decorator{
    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(3.0f);
    }
}
