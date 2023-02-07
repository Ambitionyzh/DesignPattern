package com.java.pizzastore.pizza;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/7 23:30
 */
public class LDPepperPizza implements Pizza{
    public void prepare(){
        System.out.println("LDPepperPizza prepare");
    }
    public void bake(){
        System.out.println("LDPepperPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("LDPepperPizza cut");
    }

    @Override
    public void box() {
        System.out.println("LDPepperPizza box");
    }
}
