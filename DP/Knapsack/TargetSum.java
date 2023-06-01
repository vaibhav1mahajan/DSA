package DP.Knapsack;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int k = 1;
        int a = dp(arr, k);
        System.out.println(a);
        System.out.println(recrsive(arr, 1, 0, 0));
    }

    public static int dp(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int k = (sum + target) / 2;
        if ((sum + target) % 2 != 0) {
            return 0;
        }
        int[][] ans = new int[n + 1][k + 1];
        Arrays.fill(ans[0], 0);
        for (int i = 0; i < n + 1; i++) {
            ans[i][0] = 1;
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (nums[i - 1] == 0) {
                count++;
            }
            for (int j = 1; j < k + 1; j++) {
                if (nums[i - 1] <= j) {
                    ans[i][j] = ans[i - 1][j - nums[i - 1]] + ans[i - 1][j];
                } else {
                    ans[i][j] = ans[i - 1][j];
                }
            }
        }
        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
        return (int) (Math.pow(2, count)) * ans[n][k];
    }

    public static int recrsive(int[] nums, int target, int index, int sum) {
        if (index == nums.length && sum == target) {
            return 1;
        }

        if (index == nums.length) {
            return 0;
        }
        int sumA = nums[index] + sum;
        int sumB = sum - nums[index];

        return recrsive(nums, target, index + 1, sumB) + recrsive(nums, target, index + 1, sumA);

    }
}
