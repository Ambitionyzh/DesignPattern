package com.java.pizzastore.absfactory;

import com.java.pizzastore.pizza.Pizza;

/**
 * @author yongzh
 * @version 1.0
 * @description: TODO
 * @date 2023/2/7 23:24
 */
public interface AbsFactory {
    public Pizza CreatePizza (String orderType);
}
