import java.util.Scanner;
// 14-Feb-2026
public class ChampagneTower {
    public static double champagneRowGlass(int poured, int query_row, int query_glass) {
        double dp[][] = new double[101][101];

        dp[0][0] = poured;

        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double overflow = (dp[i][j] - 1) / 2d;

                if (overflow > 0) {
                    dp[i + 1][j] += overflow;
                    dp[i + 1][j + 1] += overflow;
                }
            }
        }

        return Math.min(1, dp[query_row][query_glass]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int poured = sc.nextInt();
        int row = sc.nextInt();
        int glass = sc.nextInt();

        double res = champagneRowGlass(poured, row, glass);
        System.out.println(res);
    }
}