package DSA.Recursion;

public class PermutationWithCaseChange {
    public static void main(String[] args) {

    }

    public static void permutationWithCaseChange(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        permutationWithCaseChange(p + ch, up.substring(1));
        permutationWithCaseChange(p + String.valueOf(ch).toUpperCase(), up.substring(1));
    }
}
