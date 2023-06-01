package DP;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 10 };
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, 0 - 1);
        System.out.println(recursive(arr, 0, 0, dp));

    }

    public static int recursive(int[] arr, int index, int enregy, int[] dp) {
        if (index == arr.length - 1) {
            return enregy;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        enregy = enregy + Math.abs(arr[index] - arr[index + 1]);
        int a = recursive(arr, index + 1, enregy, dp);
        enregy = enregy - Math.abs(arr[index] - arr[index + 1]);
        int b = Integer.MAX_VALUE;
        if (index < arr.length - 2) {
            enregy = enregy + Math.abs(arr[index] - arr[index + 2]);
            b = recursive(arr, index + 2, enregy, dp);
        }
        return dp[index] = Math.min(a, b);
    }

    public static int dp(int[] arr) {
        return 0;
    }
}
