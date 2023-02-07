package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.*;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 伦敦店
 * @date 2023/2/7 23:26
 */
public class NKFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
