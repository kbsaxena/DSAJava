package dp;

import java.util.Arrays;

public class SticklerThief {
    //Method 2 Using DP
    public int findMaxSum(int arr[]) {
        int[] dp = new int[arr.length]; //i : 0 to n-1
        Arrays.fill(dp, -1);
        return loot(arr, 0, dp);
    }

    private int loot(int[] arr, int i, int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = arr[i] + loot(arr,i+2, dp);
        int skip = loot(arr, i+1, dp);
        return dp[i] = Math.max(pick, skip);
    }

    //Method 1 Using Simple recursion TC=O(2^n)
    public int findMaxSum1(int arr[]) {
        return loot(arr, 0);
    }

    private int loot(int[] arr, int i){
        if(i>=arr.length) return 0;
        int pick = arr[i] + loot(arr,i+2);
        int skip = loot(arr, i+1);
        return Math.max(pick, skip);
    }
}
