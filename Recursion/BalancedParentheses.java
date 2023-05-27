package DSA.Recursion;

public class BalancedParentheses {
    public static void main(String[] args) {
        allBalancedParentheses(3, 3, "");
    }

    public static void allBalancedParentheses(int n, int k, String p) {
        if (n == 0 && k == 0) {
            System.out.println(p);
            return;
        }
        if (k > n && k >= 0 && n >= 0) {
            allBalancedParentheses(n - 1, k, p + "(");
            allBalancedParentheses(n, k - 1, p + ")");
        } else if (k >= 0 && n >= 0) {
            allBalancedParentheses(n - 1, k, p + "(");
        }

    }
}
