package com.java.internetweather.mode;

import com.java.internetweather.observer.Observer;
import com.java.internetweather.observer.Subject;

import java.util.ArrayList;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 天气数据
 * @date 2023/2/4 11:06
 */
public class WeatherDataSt implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;
    public WeatherDataSt() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public void dataChange(){
        notifyObserver();
    }
    public void setDate(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
        observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
