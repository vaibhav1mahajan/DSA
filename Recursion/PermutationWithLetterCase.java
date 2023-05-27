package DSA.Recursion;

public class PermutationWithLetterCase {
    public static void main(String[] args) {

    }

    public static void permutationWithLetterCaseChange(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch <= 57 && ch >= 48) {
            permutationWithLetterCaseChange(p + ch, up.substring(1));
        } else {
            permutationWithLetterCaseChange(p + ch, up.substring(1));
            permutationWithLetterCaseChange(p + String.valueOf(ch).toUpperCase(), up.substring(1));
        }

    }
}
