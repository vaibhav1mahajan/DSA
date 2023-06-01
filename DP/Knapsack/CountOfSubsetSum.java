package DP;

import java.util.Arrays;

public interface CountOfSubsetSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 8, 10 };
        int sum = 10;
        System.out.println(recursive(arr, arr.length, sum));
        System.out.println(dp(arr, sum));
    }

    public static int recursive(int[] arr, int n, int sum) {
        if (sum == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (arr[n - 1] <= sum) {
            return recursive(arr, n - 1, sum - arr[n - 1]) + recursive(arr, n - 1, sum);
        } else {
            return recursive(arr, n - 1, sum);
        }
    }

    public static int dp(int[] arr, int sum) {
        int length = arr.length;
        int[][] dp = new int[length + 1][sum + 1];
        Arrays.fill(dp[0], 0);
        for (int i = 0; i < length + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int[] nums : dp) {
            System.out.println(Arrays.toString(nums));
        }
        return dp[length][sum];
    }
}
