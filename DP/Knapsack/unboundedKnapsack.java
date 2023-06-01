package DP.Knapsack;

import java.util.Arrays;

public class unboundedKnapsack {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };

    }

    public static int dp(int[] arr, int[] val, int weight) {
        int n = arr.length;

        int[][] ans = new int[n + 1][weight + 1];
        Arrays.fill(ans[0], 0);
        for (int i = 0; i < n + 1; i++) {
            ans[i][0] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < weight + 1; j++) {
                if (arr[i - 1] <= j) {
                    ans[i][j] = Math.max(val[n - 1] + ans[i][j - arr[i - 1]], ans[i - 1][j]);
                } else {
                    ans[i][j] = ans[i - 1][j];
                }
            }
        }
        return ans[n][weight];
    }
}
