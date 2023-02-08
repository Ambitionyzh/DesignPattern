package com.java.adaptermode.duck;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/8 22:26
 */
public class GreenHeadDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("gaga");
    }

    @Override
    public void fly() {
        System.out.println("i can fly  a long distance");
    }
}
