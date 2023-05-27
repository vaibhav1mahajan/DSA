package DSA.Recursion;

public class PermutationsWithSpaces {
    public static void main(String[] args) {

    }

    public static void permutationsWithString(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p.trim());
            return;
        }
        char a = s.charAt(0);

        permutationsWithString(p + " " + a, s.substring(1));
        permutationsWithString(p + a, s.substring(1));

    }

}