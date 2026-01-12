import java.util.Scanner;

public class RevNum1 {

    static int rev = 0;

    public static void reverseNum(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        reverseNum(n / 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseNum(n);
        System.out.println(rev);
        s.close();
    }
}
