package com.java.internetweather;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 天气数据
 * @date 2023/2/4 10:12
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;

    private CurrentConditions currentConditions;
    public WeatherData(CurrentConditions currentConditions){
      this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }
    public void setDate(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
