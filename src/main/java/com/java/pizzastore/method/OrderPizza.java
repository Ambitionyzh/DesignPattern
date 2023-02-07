package com.java.pizzastore.method;

import com.java.pizzastore.absfactory.AbsFactory;
import com.java.pizzastore.pizza.Pizza;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/7 23:31
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    public AbsFactory getAbsFactory() {
        return absFactory;
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType;
        this.absFactory = absFactory;
        do {
            orderType = getType();
            pizza = absFactory.CreatePizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while(true);
    }
    public String getType(){
        Scanner input = new Scanner(System.in);

        System.out.println("input pizza type");
        String st = input.nextLine();
        return st;
    }
}
