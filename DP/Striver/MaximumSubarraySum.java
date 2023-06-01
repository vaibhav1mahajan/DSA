package DP.Striver;

import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 10, 100, 10, 5 };
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(FindMaxSum(arr, 0, 0, dp));
    }

    public static int FindMaxSum(int arr[], int n, int sum, int[] dp) {
        // Your code here
        if (n >= arr.length) {
            return sum;
        }
        if (dp[n] != -1)
            return dp[n];
        sum += arr[n];
        int a = FindMaxSum(arr, n + 2, sum, dp);
        sum -= arr[n];
        int b = FindMaxSum(arr, n + 1, sum, dp);
        return dp[n] = Math.max(a, b);
    }
}
