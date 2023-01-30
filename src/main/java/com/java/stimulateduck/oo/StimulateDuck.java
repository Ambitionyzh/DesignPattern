package com.java.stimulateduck.oo;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: test
 * @date 2023/1/30 19:32
 */
public class StimulateDuck {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();

        greenHeadDuck.Quacck();
        greenHeadDuck.swim();
        greenHeadDuck.fly();

        redHeadDuck.display();

        redHeadDuck.Quacck();
        redHeadDuck.swim();
        redHeadDuck.fly();



    }
}
