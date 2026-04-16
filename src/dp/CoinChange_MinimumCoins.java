package dp;

import java.util.Arrays;

public class CoinChange_MinimumCoins {
    //Method 2 Dp Memoization
    public int minCoins(int coins[], int sum) {
        int n = coins.length;
        long[][] dp = new long[n][sum+1];
        for (long[] a: dp) {
            Arrays.fill(a, -1);
        }
        long ans = minimumCoins(0, sum, coins, dp);
        return (ans >= Integer.MAX_VALUE) ? -1: (int)ans;
    }

    // i -> 0 to n-1    sum -> sum to 0
    private long minimumCoins(int i, int sum, int[] coins, long[][] dp) {
        if(i == coins.length){
            if(sum == 0) return 0;
            else return Integer.MAX_VALUE;
        }

        if(dp[i][sum] != -1L) return dp[i][sum];

        if(sum-coins[i]>=0){
            long pick = 1 + minimumCoins(i, sum-coins[i], coins, dp); //take same coin again
            long skip = minimumCoins(i+1, sum, coins, dp); //move to next coin
            return dp[i][sum] = Math.min(pick, skip);
        } else{
            long skip = minimumCoins(i+1, sum, coins, dp); //move to next coin
            return dp[i][sum] = skip;
        }
    }
    //Method 1 Simple Recursion
    public int minCoins1(int coins[], int sum) {
        long ans = minimumCoins(0, sum, coins);
        return (ans >= Integer.MAX_VALUE) ? -1: (int)ans;
    }

    private long minimumCoins(int i, int sum, int[] coins) {
        if(i == coins.length){
            if(sum == 0) return 0;
            else return Integer.MAX_VALUE;
        }

        if(sum-coins[i]>=0){
            long pick = 1 + minimumCoins(i, sum-coins[i], coins); //take same coin again
            long skip = minimumCoins(i+1, sum, coins); //move to next coin
            return Math.min(pick, skip);
        } else{
            long skip = minimumCoins(i+1, sum, coins); //move to next coin
            return skip;
        }
    }
}
