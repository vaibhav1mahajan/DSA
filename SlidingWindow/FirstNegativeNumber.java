package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = { 10, -1, -7, 8, -15, 30, 16, 28 };
        System.out.println(negativeNumber(arr, 3));
    }

    public static ArrayList<Integer> negativeNumber(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Queue<Integer> stack = new LinkedList<>();
        while (j < arr.length) {
            if (arr[j] < 0) {
                stack.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (stack.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(stack.peek());
                    if (stack.peek() == arr[i]) {
                        stack.remove();
                    }
                }
                i++;
                j++;
            }

        }
        return ans;
    }
}