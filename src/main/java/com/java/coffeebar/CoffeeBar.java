package com.java.coffeebar;

import com.java.coffeebar.coffee.Decaf;
import com.java.coffeebar.decorator.Chocolate;
import com.java.coffeebar.decorator.Milk;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 咖啡馆
 * @date 2023/2/5 9:48
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println("**********");
        order=new Milk(order);
        order=new Chocolate(order);
        order=new Chocolate(order);

        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}
