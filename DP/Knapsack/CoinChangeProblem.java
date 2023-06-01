package DP.Knapsack;

import java.util.Arrays;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int sum = 5;
        int[][] dp = new int[arr.length + 1][sum + 1];
        System.out.println(countDp(arr, arr.length, sum, dp));
    }

    public static int countDp(int[] arr, int n, int total, int[][] dp) {
        if (total == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        dp[0][0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < total + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][total];
    }
}
