package dp;

import java.util.Arrays;

public class MinimumCostClimbingStairs {
    //Method 2 Using DP
    static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, 0, dp), minCost(cost, 1, dp));
    }

    private static int minCost(int[] cost, int i, int[] dp) {
        if(i>=cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(cost, i+1, dp), minCost(cost,i+2, dp));
    }

    //Method 1: Using Simple Recursion
    static int minCostClimbingStairs1(int[] cost) {
        return Math.min(minCost(cost, 0), minCost(cost, 1));
    }

    private static int minCost(int[] cost, int i) {
        if(i>=cost.length) return 0;
        return cost[i] + Math.min(minCost(cost, i+1), minCost(cost,i+2));
    }
}
