import java.util.Scanner;

public class CountDigits {
    public static int countDigit(int n) {
        int count = 0;

        if (n == 0)
            return 1;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("The number of digits in " + n + " is: " + countDigit(n));

    }
}