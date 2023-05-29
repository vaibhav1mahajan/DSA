public class N_Queen {
    public static void main(String[] args) {
        int[][] chess = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
        };

    }

    public static void n_queen(int r, int c, int[][] chess, int n) {
        if (n == 0) {
            return;
        }
        if (chess[r][c] == 1) {
            return;
        }

    }
}
