package com.java.singleton;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 单例模式-巧克力工厂
 * @date 2023/2/7 22:09
 */
public class ChocolateFactory {
    private boolean empty ;
    private boolean boiled ;

    public volatile static  ChocolateFactory uniqueInstance = null;
    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }
    public static ChocolateFactory getInstance(){
        if(uniqueInstance == null){
            synchronized (ChocolateFactory.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateFactory();
                }
            }
        }
        return  uniqueInstance;
    }
    public void fill(){
        if(empty){
            empty = false;
            boiled = false;
        }
    }
    public  void drain(){
        if(!empty && boiled){
            boiled = true;
        }

    }
}
