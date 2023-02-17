package com.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    private static boolean flag = false;

    public volatile static  ChocolateFactory uniqueInstance = null;
    private ChocolateFactory() {
        synchronized (ChocolateFactory.class){
            if(flag == false){
                flag = true;
            }else{
                throw  new RuntimeException("不要试图使用反射破坏异常");
            }
          /*  if(uniqueInstance!=null){
                throw  new RuntimeException("不要试图使用反射破坏异常");
            }*/
        }
        empty = true;
        boiled = false;
    }
    public static ChocolateFactory getInstance(){
        if(uniqueInstance == null){
            synchronized (ChocolateFactory.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateFactory();//不是一个原子性操作
                    /**
                     *1.分配内存空间
                     *2.执行构造方法，初始化对象
                     *3.把这个对象指向这个空间
                     * 不加volatile执行顺序可能是123，可能是132 此时uniqueInstance还没有完成构造
                     */
                }
            }
        }
        return  uniqueInstance;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*ChocolateFactory chocolateFactory1 = new ChocolateFactory();
        ChocolateFactory chocolateFactory2 = new ChocolateFactory();
        System.out.println(chocolateFactory2);
        System.out.println(chocolateFactory1);*/
        // ChocolateFactory chocolateFactory3 = ChocolateFactory.getInstance();
        //ChocolateFactory chocolateFactory4 = ChocolateFactory.getInstance();
        //单例模式创建
       // System.out.println(chocolateFactory3);
        //System.out.println(chocolateFactory4);

        //破坏单例模式
        Constructor<ChocolateFactory> declaredConstructor = ChocolateFactory.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        ChocolateFactory chocolateFactory = declaredConstructor.newInstance();
        ChocolateFactory chocolateFactory5 = declaredConstructor.newInstance();
        System.out.println(chocolateFactory);
        System.out.println(chocolateFactory5);


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
