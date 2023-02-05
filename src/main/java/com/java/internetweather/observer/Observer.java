package com.java.internetweather.observer;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 观察者
 * @date 2023/2/4 10:53
 */
public interface Observer {
    public void update(float temperature,float pressure,float humidity);
}
