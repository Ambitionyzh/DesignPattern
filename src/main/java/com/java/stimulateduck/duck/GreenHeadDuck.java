package com.java.stimulateduck.duck;

import com.java.stimulateduck.flyBehavior.GoodFlyBehavior;
import com.java.stimulateduck.quackBehavior.GaGaQuackBehavior;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 绿头鸭
 * @date 2023/1/30 19:58
 */
public class GreenHeadDuck extends Duck{

    public GreenHeadDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }
}
