package com.java.State.task.v3.observers;


import com.java.State.task.service.ActivityService;

public class ActivityObserver implements Observer {
    private ActivityService activityService;

    public ActivityObserver() {
        this.activityService = new ActivityService();
    }

    @Override
    public void response(Long taskId) {
        activityService.notifyFinished(taskId);
    }
}
