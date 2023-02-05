package com.java.internetweather.observer;

/**
 * @author yongzh
 * @version 1.0
 * @description: TODO
 * @date 2023/2/4 10:56
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
