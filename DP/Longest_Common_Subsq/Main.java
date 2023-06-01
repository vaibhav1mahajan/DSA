package DP.Longest_Common_Subsq;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String x = "ababcdgh";
        String y = "abedghr";
        // String p = "";
        System.out.println(recursive(x, y, 0));
        int[][] dp = new int[x.length()][y.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(recursiveMemo(x, y, x.length() - 1, y.length() - 1, dp));
        System.out.println(dp(x, y));
    }

    public static int recursive(String x, String y, int count) {
        if (x.length() == 0 || y.length() == 0) {
            return count;
        }
        if (x.charAt(0) == y.charAt(0)) {
            return recursive(x.substring(1), y.substring(1), count + 1);
        }
        int a = recursive(x.substring(1), y, count);
        int b = recursive(x, y.substring(1), count);

        return Math.max(a, b);
    }

    public static int recursiveMemo(String x, String y, int n, int m, int[][] dp) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (x.charAt(n) == y.charAt(m)) {
            return dp[n][m] = 1 + recursiveMemo(x, y, n - 1, m - 1, dp);
        }
        int a = recursiveMemo(x, y, n - 1, m, dp);
        int b = recursiveMemo(x, y, n, m - 1, dp);
        return dp[n][m] = Math.max(a, b);
    }

    public static int dp(String x, String y) {
        int n = x.length();
        int m = y.length();
        int[][] ans = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    ans[i][j] = 1 + ans[i - 1][j - 1];
                } else {
                    ans[i][j] = Math.max(ans[i][j - 1], ans[i - 1][j]);
                }
            }
        }
        return ans[n][m];
    }
}
