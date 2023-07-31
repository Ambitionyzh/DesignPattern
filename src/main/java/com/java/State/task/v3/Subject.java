package com.java.State.task.v3;



import com.java.State.task.v3.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(long taskId) {
        observers.forEach(v -> v.response(taskId));
    }

}
