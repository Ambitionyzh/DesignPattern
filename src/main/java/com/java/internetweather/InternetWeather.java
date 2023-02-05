package com.java.internetweather;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 查看天气
 * @date 2023/2/4 10:19
 */
public class InternetWeather {
    public static void main(String[] args) {
       CurrentConditions currentConditions = new CurrentConditions();
       WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setDate(30,150,40);
    }
}
