package dp;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    //Method2 Using DP Memoization
    static boolean equalPartition(int arr[]) {
        int arraySum = 0;
        for(int ele: arr) arraySum += ele;
        if(arraySum % 2 == 1) return false;
        int n = arr.length;
        int target = arraySum/2;
        //cannot use boolean as it stores only true and false, then how to store unvisited or -1 value
        Boolean[][] dp = new Boolean[n][target+1]; //auto initializes whole array with null
        return subset(0, target, arr, dp);
    }

    //i -> 0 to n-1   target-> target to 0
    private static boolean subset(int i, int target, int[] arr, Boolean[][] dp) {
        if(i == arr.length) return (target == 0);
        if(dp[i][target] != null) return dp[i][target];
        if(target - arr[i] >= 0){
            boolean pick = subset(i+1, target-arr[i], arr, dp);
            boolean skip = subset(i+1, target, arr, dp);
            return dp[i][target] = pick || skip;
        } else {
            boolean skip = subset(i+1, target, arr, dp);
            return dp[i][target] = skip;
        }
    }

    //Method1 Using Simple Recursion
    static boolean equalPartition1(int arr[]) {
        int arraySum = 0;
        for(int ele: arr) arraySum += ele;
        if(arraySum % 2 == 1) return false;
        int target = arraySum/2;
        return subset(0, target, arr);
    }

    private static boolean subset(int i, int target, int[] arr) {
        if(i == arr.length) return (target == 0);
        if(target - arr[i] >= 0){
            boolean pick = subset(i+1, target-arr[i], arr);
            boolean skip = subset(i+1, target, arr);
            return pick || skip;
        } else {
            boolean skip = subset(i+1, target, arr);
            return skip;
        }
    }
}
