package com.java.State.task.v2;


import com.java.State.task.enums.ActionType;

public interface State {
    // 默认实现，不做任何处理
    default void update(TaskV2 taskV2, ActionType actionType) {
        // do nothing
    }
}
