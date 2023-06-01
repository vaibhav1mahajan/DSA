package DP.Knapsack;

import java.util.Arrays;

public class NumberOfSubsetWithGivenDifference {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        System.out.println(dp(arr, 1));
    }

    public static int dp(int[] arr, int diff) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if ((sum + diff) % 2 != 0) {
            return 0;
        }
        int k = (sum + diff) / 2;
        int[][] ans = new int[arr.length + 1][sum + 1];
        Arrays.fill(ans[0], 0);
        for (int i = 0; i < arr.length + 1; i++) {
            ans[i][0] = 1;
        }
        for (int i = 1; i < ans.length; i++) {
            for (int j = 1; j < k + 1; j++) {
                if (arr[i - 1] <= j) {
                    ans[i][j] = ans[i - 1][j - arr[i - 1]] + ans[i - 1][j];
                } else {
                    ans[i][j] = ans[i - 1][j];
                }
            }
        }
        return ans[arr.length][k];
    }

}
