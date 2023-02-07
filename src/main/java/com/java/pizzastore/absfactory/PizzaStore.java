package com.java.pizzastore.absfactory;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/7 23:49
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new NKFactory());
    }
}
