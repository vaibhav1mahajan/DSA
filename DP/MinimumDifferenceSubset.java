package DP;

import java.util.Arrays;

public class MinimumDifferenceSubset {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 11, 5 };
        System.out.println(recursive(arr, 4, 0, 0));
        System.out.println(dp(arr));
    }

    public static int recursive(int[] arr, int n, int a, int b) {
        if (n == 0) {
            return Math.abs(a - b);
        }
        a += arr[n - 1];
        int c = recursive(arr, n - 1, a, b);
        a -= arr[n - 1];
        b += arr[n - 1];
        int d = recursive(arr, n - 1, a, b);
        return Math.min(c, d);
    }

    public static int dp(int[] arr){
        int n = arr.length;
        int sum=0;
        for(int i : arr){
            sum+=i;
        }

        boolean[][] ans = new boolean[n+1][sum+1];
        Arrays.fill(ans[0],false);
        for(int i =0;i<n+1;i++){
            ans[i][0] = false;
        }

        for(int i =1;i<n+1;i++){
            for (int j = 0; j < sum+1; j++) {
                if(j-arr[i-1]>=0){
                    ans[i][j] = true;
                } else{
                    ans[i][j] =  false;
                }
            }
        }
        for(int i=0;i<sum+1;i++){
            if(ans[n][i] == true){
                return i;
            }
        }
        return 0;
    }
}
