package com.java.State.task.v3;


import com.java.State.task.enums.ActionType;
import com.java.State.task.service.ActivityService;
import com.java.State.task.service.TaskManager;
import com.java.State.task.v3.observers.ActivityObserver;
import com.java.State.task.v3.observers.TaskManageObserver;

public class TaskContextV3 {
    // 任务初始状态
    public static class TaskInit implements StateV3 {
        @Override
        public void update(TaskV3 taskV3, ActionType actionType) {
            System.out.println("1. 任务初始化, actionType=" + actionType);
            if (actionType == ActionType.START) {
                TaskOngoing taskOngoing = new TaskOngoing();
                taskV3.setState(taskOngoing);
                taskOngoing.add(new ActivityObserver());
                taskOngoing.add(new TaskManageObserver());
            }
        }
    }

    // 任务进行状态
    public static class TaskOngoing extends Subject implements StateV3 {
        private final ActivityService activityService;
        private final TaskManager taskManager;

        public TaskOngoing() {
            this.activityService = new ActivityService();
            this.taskManager = new TaskManager();
        }

        @Override
        public void update(TaskV3 taskv3, ActionType actionType) {
            System.out.println("3. 任务执行中 ActionType=" + actionType);
            if (actionType == ActionType.ACHIEVE) {
                taskv3.setState(new TaskFinished());

                // 通知
                notifyObservers(taskv3.getTaskId());
            } else if (actionType == ActionType.STOP) {
                taskv3.setState(new TaskPaused());
            } else if (actionType == ActionType.EXPIRE) {
                taskv3.setState(new TaskExpired());
            }
        }
    }

    // 任务暂停状态
    public static class TaskPaused implements StateV3 {
        @Override
        public void update(TaskV3 taskV3, ActionType actionType) {
            System.out.println("2. 任务暂停，actionType=" + actionType);
            if (actionType == ActionType.START) {
                taskV3.setState(new TaskOngoing());
            } else if (actionType == ActionType.EXPIRE) {
                taskV3.setState(new TaskExpired());
            }
        }
    }

    // 任务完成状态
    static class TaskFinished implements StateV3 {
        @Override
        public void update(TaskV3 taskV3, ActionType actionType) {
            System.out.println("4. 任务完成, actionType=" + actionType);
        }
    }

    // 任务过期状态
    static class TaskExpired implements StateV3 {
        @Override
        public void update(TaskV3 taskV3, ActionType actionType) {
            System.out.println("5. 任务过期, actionType=" + actionType);
        }
    }
}
