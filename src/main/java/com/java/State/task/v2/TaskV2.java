package com.java.State.task.v2;


import com.java.State.task.enums.ActionType;
import lombok.Data;

@Data
public class TaskV2 {
    private Long taskId;
    // 初始化为初始态
    private State state = new TaskContext.TaskInit();

    public TaskV2(Long taskId) {
        this.taskId = taskId;
    }

    // 更新状态
    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }
}
