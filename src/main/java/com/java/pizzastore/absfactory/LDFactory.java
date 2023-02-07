package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.LDCheesePizza;
import com.java.pizzastore.pizza.LDPepperPizza;
import com.java.pizzastore.pizza.Pizza;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 伦敦店
 * @date 2023/2/7 23:26
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
