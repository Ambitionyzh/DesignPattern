package com.java.internetweather.mode;

import com.java.internetweather.observer.Observer;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 明天天气
 * @date 2023/2/4 11:04
 */
public class ForcastConditions implements Observer {
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
        System.out.println("明天温度 :"+(temperature+1.2));
        System.out.println("明天气压 :"+(pressure+1.5));
        System.out.println("明天湿度 :"+(humidity+0.1231));
    }
}
