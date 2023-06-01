package DP;

import java.util.Arrays;

public class SubsetProblemSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 8, 10 };
        int k = 11;
        System.out.println(recursive(arr, 5, k));
        boolean dp[][] = new boolean[1001][1001];
        Arrays.fill(dp[0], false);
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        System.out.println(dp(arr, dp, 5, k));

    }

    public static boolean recursive(int[] arr, int n, int k) {
        if (k == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] <= k) {
            return recursive(arr, n - 1, k - arr[n - 1]) || recursive(arr, n - 1, k);
        } else {
            return recursive(arr, n - 1, k);
        }
    }

    public static boolean dp(int[] arr, boolean[][] dp, int n, int k) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][k];
    }

}
