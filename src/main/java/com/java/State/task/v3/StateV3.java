package com.java.State.task.v3;


import com.java.State.task.enums.ActionType;

public interface StateV3 {
    // 默认实现，不做任何处理
    default void update(TaskV3 taskV2, ActionType actionType) {
        // do nothing
    }
}
