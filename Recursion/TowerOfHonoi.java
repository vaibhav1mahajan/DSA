package DSA.Recursion;

public class TowerOfHonoi {
    public static void main(String[] args) {
        towerOfHonoi(10, 1, 2, 3);
    }

    public static void towerOfHonoi(int n, int s, int h, int d) {
        if (n == 1) {
            System.out.printf("Move disk %d from %d to %d", n, s, d);
            System.out.println();
            return;
        }
        towerOfHonoi(n - 1, s, d, h);
        System.out.printf("Move disk %d from %d to %d", n, s, d);
        System.out.println();
        towerOfHonoi(n - 1, h, s, d);
    }
}
