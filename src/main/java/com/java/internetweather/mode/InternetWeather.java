package com.java.internetweather.mode;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description: 天气
 * @date 2023/2/4 11:13
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherDataSt weatherDataSt = new WeatherDataSt();
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);

        weatherDataSt.setDate(30,50,40);
        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setDate(40,150,45);


    }
}
