package com.java.pizzastore.pizza;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 纽约披萨
 * @date 2023/2/7 23:29
 */
public class NYCheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("NYCheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYCheesePizza box");
    }
}
