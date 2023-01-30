package com.java.stimulateduck.duck;

import com.java.stimulateduck.flyBehavior.FlyBehavior;
import com.java.stimulateduck.quackBehavior.QuackBehavior;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 鸭子
 * @date 2023/1/30 19:42
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public  Duck(){}
    public void Quacck(){
        quackBehavior.quack();
    }
    public void fly(){
        flyBehavior.fly();
    }
    public abstract void display();

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void swim(){
        System.out.println("I can swim~");
    }
}
