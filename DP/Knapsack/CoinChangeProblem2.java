package DP.Knapsack;

import java.util.Arrays;

public class CoinChangeProblem2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int sum = 5;

    }

    public static int countDp(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];
        Arrays.fill(dp[0], 0);
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

            }
        }
    }
}
