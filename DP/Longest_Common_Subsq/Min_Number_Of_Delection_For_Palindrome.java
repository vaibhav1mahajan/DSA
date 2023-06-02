package DP.Longest_Common_Subsq;

public class Min_Number_Of_Delection_For_Palindrome {
    public static void main(String[] args) {
        String x = "agbcba";
        System.out.println(dp(x));
    }

    public static int dp(String x) {
        StringBuilder dummy = new StringBuilder(x);
        dummy = dummy.reverse();
        String y = dummy.toString();
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
        return /* Deletion */(n - ans[n][m]);
    }
}
