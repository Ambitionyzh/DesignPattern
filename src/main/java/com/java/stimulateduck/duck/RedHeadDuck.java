package com.java.stimulateduck.duck;

import com.java.stimulateduck.flyBehavior.BadFlyBehavior;
import com.java.stimulateduck.flyBehavior.GoodFlyBehavior;
import com.java.stimulateduck.quackBehavior.GaGaQuackBehavior;
import com.java.stimulateduck.quackBehavior.GeGeQuackBehavior;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 绿头鸭
 * @date 2023/1/30 19:58
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("**RedHead**");
    }
}
