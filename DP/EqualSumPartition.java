package DP;

public class EqualSumPartition {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 11, 5 };
        System.out.println(recursive(arr, 0, 0, 0, 4));
    }

    public static boolean recursive(int[] arr, int n, int a, int b, int length) {
        if (n == length && a == b) {
            return true;
        }
        if (n == length) {
            return false;
        }
        a += arr[n];
        boolean c = recursive(arr, n + 1, a, b, length);
        a -= arr[n];
        b += arr[n];
        boolean d = recursive(arr, n + 1, a, b, length);
        return c || d;
    }
}