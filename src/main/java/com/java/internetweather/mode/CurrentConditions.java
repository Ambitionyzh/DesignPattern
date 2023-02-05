package com.java.internetweather.mode;

import com.java.internetweather.observer.Observer;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 公告板
 * @date 2023/2/4 10:59
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public  void display(){
        System.out.println("Today temperature:"+temperature);
        System.out.println("Today pressure:"+pressure);
        System.out.println("Today humidity:"+humidity);
    }
}
