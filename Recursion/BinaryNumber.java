package DSA.Recursion;

public class BinaryNumber {
    public static void main(String[] args) {

    }

    public static void binaryNumber(int n, int ones, int zeros, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        if (ones > zeros && n > 0) {
            binaryNumber(n - 1, ones + 1, zeros, s + "1");
            binaryNumber(n - 1, ones, zeros + 1, s + "0");
        } else if (ones == zeros) {
            binaryNumber(n - 1, ones + 1, zeros, s + "1");
        } else {
            return;
        }
    }
}
