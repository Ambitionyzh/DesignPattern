package com.java.stimulateduck.quackBehavior;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 嘎嘎叫
 * @date 2023/1/30 20:01
 */
public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("__NoQuack__");
    }
}
