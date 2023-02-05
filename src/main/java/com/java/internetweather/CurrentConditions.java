package com.java.internetweather;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 当前天气情况
 * @date 2023/2/4 10:04
 */
public class CurrentConditions {

    private float temperature;
    private float pressure;
    private float humidity;
    public void update(float temperature,float pressure,float humidity){
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
