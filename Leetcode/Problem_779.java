package DSA.Leetcode;

public class Problem_779 {
    public static void main(String[] args) {

    }

    public static int recrusive(int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 && k == 1) {
            return 0;
        }
        if (n == 1 && k == 2) {
            return 1;
        }
        if (k % 2 == 0) {
            int a = recrusive(n - 1, k / 2);
            if (a % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (k % 2 != 0) {
            int a = recrusive(n - 1, (k + 1) / 2);
            if (a % 2 == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        return 1;
    }
}