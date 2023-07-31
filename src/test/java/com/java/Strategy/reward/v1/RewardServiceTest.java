package com.java.Strategy.reward.v1;

import com.java.Strategy.reward.v3.FoodV3;
import com.java.Strategy.reward.v3.HotelV3;
import com.java.Strategy.reward.v3.StrategyContextV3;
import com.java.Strategy.reward.v3.WaimaiV3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RewardServiceTest {

    private RewardService rewardServiceUnderTest;

    @BeforeEach
    void setUp() {
        rewardServiceUnderTest = new RewardService();
    }

    @Test
    void testIssueRewardV1() {
        // Setup
        // Run the test
        rewardServiceUnderTest.issueRewardV1("Waimai", "params");
        rewardServiceUnderTest.issueRewardV1("Hotel", "params");
        rewardServiceUnderTest.issueRewardV1("Food", "params");

        // Verify the results
    }

    @Test
    void testIssueRewardV2() {
        // Setup
        // Run the test
        rewardServiceUnderTest.issueRewardV2("Waimai", "params");
        rewardServiceUnderTest.issueRewardV2("Hotel", "params");
        rewardServiceUnderTest.issueRewardV2("Food", "params");

        // Verify the results
    }

    @Test
    void testIssueRewardV3() {
        // Setup
        // Run the test
        StrategyContextV3.registerStrategy("Waimai", WaimaiV3.getInstance());
        StrategyContextV3.registerStrategy("Hotel", HotelV3.getInstance());
        StrategyContextV3.registerStrategy("Food", FoodV3.getInstance());
        
        rewardServiceUnderTest.issueRewardV3("Waimai", "params");
        rewardServiceUnderTest.issueRewardV3("Hotel", "params");
        rewardServiceUnderTest.issueRewardV3("Food", "params");

        // Verify the results
    }
}
