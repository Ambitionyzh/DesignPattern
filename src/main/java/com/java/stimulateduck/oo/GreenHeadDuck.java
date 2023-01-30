package com.java.stimulateduck.oo;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 绿头鸭
 * @date 2023/1/30 19:27
 */
public class GreenHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }

    public void fly() {
        System.out.println("**Can not fly**");
    }
}
