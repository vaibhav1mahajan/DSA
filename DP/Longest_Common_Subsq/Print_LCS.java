package DP.Longest_Common_Subsq;

public class Print_LCS {
    public static void main(String[] args) {
        String x = "ababcdgh";
        String y = "abedghr";
        System.out.println(x);
        System.out.println(y);
        System.out.println(dp(x, y));
    }

    public static String dp(String x, String y) {
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
        // return "Sss";
        int i = n;
        int j = m;
        StringBuilder p = new StringBuilder();
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                p.append(x.charAt(i - 1));
                i--;
                j--;
            } else {
                if (ans[i - 1][j] > ans[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return p.reverse().toString();
    }
}
