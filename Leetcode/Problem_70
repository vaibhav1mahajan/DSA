class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        int prev2 = 0;
        int prev = 1;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = prev + prev2;
            prev2 = prev;
            prev = current;
        }
        return current;
    }
}