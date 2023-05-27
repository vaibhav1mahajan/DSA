package DSA.Recursion;

import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        int people = 40;
        int k = 7;
        System.out.println(josephusProblem(people, k));
    }

    public static int josephusProblem(int n, int k) {
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            a.add(i);
        }
        return helperJosephus(k - 1, a, 0).get(0);
    }

    public static ArrayList<Integer> helperJosephus(int k, ArrayList<Integer> arr, int index) {
        if (arr.size() == 1) {
            return arr;
        }
        int remove = (index + k) % arr.size();
        arr.remove(remove);
        return helperJosephus(k, arr, remove);
    }
}
