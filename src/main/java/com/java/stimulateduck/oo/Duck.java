package com.java.stimulateduck.oo;

/**
 * @author yongzh
 * @version 1.0
 * @program: JavaTest
 * @description: 模拟鸭子项目
 * @date 2023/1/30 19:24
 */
public abstract class Duck {
    public  Duck(){}
    public void Quacck(){
        System.out.println("gaga~");
    }
    public abstract void display();
    public void swim(){
        System.out.println("I can swim~");
    }

    public void fly(){
        System.out.println("I can fly~");
    }

}
