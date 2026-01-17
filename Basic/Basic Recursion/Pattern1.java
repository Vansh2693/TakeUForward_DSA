public class Pattern1 {

    static void invTriangle(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            System.out.print("*");
            invTriangle(r, c + 1);
        } else {
            System.out.println();
            invTriangle(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        invTriangle(4, 0);
    }
}