package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 巧克力
 * @date 2023/2/5 9:46
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink Obj) {
        super(Obj);
        super.setDescription("Chocolate");
        super.setPrice(2.0f);
    }
}
