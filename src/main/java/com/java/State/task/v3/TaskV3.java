package com.java.State.task.v3;


import com.java.State.task.enums.ActionType;
import lombok.Data;

@Data
public class TaskV3 {
    private Long taskId;
    // 初始化为初始态
    private StateV3 state = new TaskContextV3.TaskInit();

    public TaskV3(Long taskId) {
        this.taskId = taskId;
    }

    // 更新状态
    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }
}
