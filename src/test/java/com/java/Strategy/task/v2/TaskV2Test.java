package com.java.Strategy.task.v2;

import com.java.State.task.enums.ActionType;
import com.java.State.task.v2.TaskV2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskV2Test {

    private TaskV2 taskV2UnderTest;

    @BeforeEach
    void setUp() {
        taskV2UnderTest = new TaskV2(1L);
    }

    @Test
    void testUpdateState() {
        // Setup
        // Run the test
        taskV2UnderTest.updateState(ActionType.START);
        taskV2UnderTest.updateState(ActionType.ACHIEVE);
        taskV2UnderTest.updateState(ActionType.EXPIRE);
        // Verify the results
    }
}
