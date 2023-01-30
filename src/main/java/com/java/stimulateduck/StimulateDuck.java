package com.java.stimulateduck;

import com.java.stimulateduck.duck.Duck;
import com.java.stimulateduck.duck.GreenHeadDuck;
import com.java.stimulateduck.duck.RedHeadDuck;
import com.java.stimulateduck.flyBehavior.NoFlyBehavior;
import com.java.stimulateduck.quackBehavior.NoQuackBehavior;


/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 模拟函数
 * @date 2023/1/30 20:10
 */

public class StimulateDuck {
    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Quacck();
        greenHeadDuck.swim();
        greenHeadDuck.fly();

        redHeadDuck.display();
        redHeadDuck.Quacck();
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.setFlyBehavior(new NoFlyBehavior());
        redHeadDuck.fly();
        redHeadDuck.setQuackBehavior(new NoQuackBehavior());
        redHeadDuck.Quacck();

    }
}
