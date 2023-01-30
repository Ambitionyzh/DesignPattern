package com.java.stimulateduck.flyBehavior;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 好的飞
 * @date 2023/1/30 19:59
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("**No fly**");
    }
}
