package com.java.coffeebar.decorator;

import com.java.coffeebar.Drink;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/5 9:41
 */
public class Decorator extends Drink {
    private Drink Obj;

    public Decorator(Drink Obj){
        this.Obj = Obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+Obj.cost();

    }
    @Override
    public String getDescription(){
        return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
    }
}
