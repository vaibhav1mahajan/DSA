package DP.Longest_Common_Subsq;

public class Main {
    public static void main(String[] args) {
        String x = "ababcdgh";
        String y = "abedghr";
        // String p = "";
        System.out.println(recursive(x, y, 0));
        System.out.println(p);
    }

    public static int recursive(String x, String y, int count) {
        if (x.length() == 0 || y.length() == 0) {
            return count;
        }
        if (x.charAt(0) == y.charAt(0)) {
            p += x.charAt(0);
            return recursive(x.substring(1), y.substring(1), count + 1);
        }
        int a = recursive(x.substring(1), y, count);
        int b = recursive(x, y.substring(1), count);
        if (count == 0) {
            System.out.println(p);
        }
        return Math.max(a, b);
    }

    public static String p = "";
}
