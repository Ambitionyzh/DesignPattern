package com.java.singleton;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/17 20:55
 */
public class Holder {
    public Holder() {
    }

    public static Holder getInstance(){
       return InnerClass.HOLDER;
    }
    public static class InnerClass{
        private  static final Holder HOLDER = new Holder();
    }
}
