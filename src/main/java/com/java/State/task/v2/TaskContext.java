package com.java.State.task.v2;


import com.java.State.task.enums.ActionType;
import com.java.State.task.service.ActivityService;
import com.java.State.task.service.TaskManager;

public class TaskContext {
    // 任务初始状态
    public static class TaskInit implements State {
        @Override
        public void update(TaskV2 taskV2, ActionType actionType) {
            System.out.println("任务初始化");
            if (actionType == ActionType.START) {
                taskV2.setState(new TaskOngoing());
            }
        }
    }

    // 任务进行状态
    public static class TaskOngoing implements State {
        private final ActivityService activityService;
        private final TaskManager taskManager;

        public TaskOngoing() {
            this.activityService = new ActivityService();
            this.taskManager = new TaskManager();
        }

        @Override
        public void update(TaskV2 taskV2, ActionType actionType) {
            System.out.println("ActionType=" + actionType);
            if (actionType == ActionType.ACHIEVE) {
                taskV2.setState(new TaskFinished());
                // 通知
                activityService.notifyFinished(taskV2.getTaskId());
                taskManager.release(taskV2.getTaskId());
            } else if (actionType == ActionType.STOP) {
                taskV2.setState(new TaskPaused());
            } else if (actionType == ActionType.EXPIRE) {
                taskV2.setState(new TaskExpired());
            }
        }
    }

    // 任务暂停状态
    public static class TaskPaused implements State {
        @Override
        public void update(TaskV2 taskV2, ActionType actionType) {
            System.out.println("任务暂停，actionType=" + actionType);
            if (actionType == ActionType.START) {
                taskV2.setState(new TaskOngoing());
            } else if (actionType == ActionType.EXPIRE) {
                taskV2.setState(new TaskExpired());
            }
        }
    }

    // 任务完成状态
    static class TaskFinished implements State {
        @Override
        public void update(TaskV2 taskV2, ActionType actionType) {
            System.out.println("任务完成");
        }
    }

    // 任务过期状态
    static class TaskExpired implements State {
        @Override
        public void update(TaskV2 taskV2, ActionType actionType) {
            System.out.println("任务过期");
        }
    }
}
