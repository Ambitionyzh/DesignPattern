package com.java.Strategy.task.v3;

import com.java.State.task.enums.ActionType;
import com.java.State.task.v3.TaskV3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class TaskV3Test {

    private TaskV3 taskV3UnderTest;

    @BeforeEach
    void setUp() {
        taskV3UnderTest = new TaskV3(0L);
    }

    @Test
    void testUpdateState() {
        // Setup
        // Run the test
        taskV3UnderTest.updateState(ActionType.START);
        taskV3UnderTest.updateState(ActionType.STOP);
        taskV3UnderTest.updateState(ActionType.START);
        taskV3UnderTest.updateState(ActionType.ACHIEVE);
        taskV3UnderTest.updateState(ActionType.EXPIRE);

        // Verify the results
    }

    @Test
    void testLottery() {
        // 抽奖小程序 21
        // 1. 随机生成8个21之内的不重复数字
        // 2. 排序打印
        List<Integer> prizes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int number = new Random().nextInt(21) + 1;
            if (!prizes.contains(number)) {
                prizes.add(number);
            }
            if (prizes.size() >= 8) {
                break;
            }
        }
        System.out.println(prizes.stream().sorted().collect(Collectors.toList()));
    }
}
