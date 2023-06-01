package DP.Knapsack;

import java.util.Arrays;

class Knapsack_1 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5 };
        int[] val = { 1, 3, 5, 7 };
        int w = 7;
        for (int[] i : dp) {
            Arrays.fill(i, 0);
        }

    }

    static int[][] dp = new int[1001][1001];

    public static int recursive(int[] arr, int[] val, int w, int index, int currentW, int sum) {
        if (currentW == w || index == arr.length) {
            return sum;
        }
        currentW += arr[index];
        if (currentW > w) {
            currentW -= arr[index];
            return recursive(arr, val, w, index + 1, currentW, sum);
        } else {
            sum += val[index];
            int b = recursive(arr, val, w, index, currentW, sum);
            currentW -= arr[index];
            sum -= val[index];

            int a = recursive(arr, val, w, index + 1, currentW, sum);
            return Math.max(a, b);
        }

    }

    public static int recursiveFast(int[] arr, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (arr[n - 1] <= w) {
            return Math.max(val[n - 1] + recursiveFast(arr, val, w - arr[n - 1], n - 1),
                    recursiveFast(arr, val, w, n - 1));
        } else {
            return recursiveFast(arr, val, w, n - 1);
        }
    }

    public static int Dp(int[] arr, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (dp[n][w] != -1) {
            return dp[n][w];
        }
        if (arr[n - 1] <= w) {
            return dp[n][w] = Math.max(val[n - 1] + Dp(arr, val, w - arr[n - 1], n - 1),
                    Dp(arr, val, w, n - 1));
        } else {
            return dp[n][w] = Dp(arr, val, w, n - 1);
        }
    }
}