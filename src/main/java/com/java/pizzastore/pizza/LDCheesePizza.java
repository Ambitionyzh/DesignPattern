package com.java.pizzastore.pizza;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/7 23:30
 */
public class LDCheesePizza implements Pizza {
    public void prepare(){
        System.out.println("LDCheesePizza prepare");
    }
    public void bake(){
        System.out.println("LDCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("LDCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("LDCheesePizza box");
    }
}
