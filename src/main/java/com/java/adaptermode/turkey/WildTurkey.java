package com.java.adaptermode.turkey;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/8 22:28
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gugugu");
    }

    @Override
    public void fly() {
        System.out.println("i can fly  a short distance");
    }
}
