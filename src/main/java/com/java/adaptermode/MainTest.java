package com.java.adaptermode;

import com.java.adaptermode.adapter.TurkeyAdapter;
import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.duck.GreenHeadDuck;
import com.java.adaptermode.turkey.Turkey;
import com.java.adaptermode.turkey.WildTurkey;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/8 22:31
 */
public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }


}
