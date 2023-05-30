import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int arrLength = nums.length;
        boolean[][] dp = new boolean[arrLength + 1][sum / 2 + 1];
        int length = dp.length;
        Arrays.fill(dp[0], false);
        for (int i = 0; i < length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < (sum / 2 + 1); j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[arrLength][sum / 2];
    }

}