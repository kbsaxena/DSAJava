package dp;

public class UniquePaths {
    //Method 3 Using Tabulation
    public int numberOfPaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == 0) dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    //Method 2 Using DP
    public int numberOfPaths2(int m, int n) {// m: m to 1, n: n to 1
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return paths(m, n, dp);
    }

    public int paths(int m, int n, int[][] dp){
        if(m == 1 || n == 1) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = paths(m-1,n, dp) + paths(m,n-1, dp);
    }

    //Method 1 Simple Recursion
    public int numberOfPaths1(int m, int n) {
        return paths(m,n);
    }

    public int paths(int m, int n){
        if(m == 1 || n == 1) return 1;
        return paths(m-1,n) + paths(m,n-1);
    }
}
