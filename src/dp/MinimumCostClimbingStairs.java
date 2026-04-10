package dp;

public class MinimumCostClimbingStairs {
    //Using Simple Recursion
    static int minCostClimbingStairs(int[] cost) {
        return Math.min(minCost(cost, 0), minCost(cost, 1));
    }

    private static int minCost(int[] cost, int i) {
        if(i>=cost.length) return 0;
        return cost[i] + Math.min(minCost(cost, i+1), minCost(cost,i+2));
    }
}
