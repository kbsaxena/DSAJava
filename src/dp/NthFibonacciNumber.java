package dp;

import java.util.Arrays;

public class NthFibonacciNumber {
    //Method 2 - Using DP
    public int nthFibonacci(int n) {
        int[] dp = new int[n+1]; //0 to n index
        Arrays.fill(dp, -1); //-1 mean unvisited
        return fibo(n, dp);
    }

    private int fibo(int n, int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }


    //Method 1 TC = O(2^n)
    public int nthFibonacci1(int n) {
        // code here
        if(n==0 || n==1) return n;
        return nthFibonacci1(n-1) + nthFibonacci1(n-2);
    }
}
