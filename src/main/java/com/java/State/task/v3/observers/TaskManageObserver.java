package com.java.State.task.v3.observers;


import com.java.State.task.service.TaskManager;

public class TaskManageObserver implements Observer {

    private TaskManager taskManager;

    public TaskManageObserver() {
        this.taskManager = new TaskManager();
    }

    @Override
    public void response(Long taskId) {
        taskManager.release(taskId);
    }
}
