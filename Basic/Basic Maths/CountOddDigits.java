import java.util.Scanner;

class CountOddDigits {
    public static int countOddDigit(int n) {
        int countOdd = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0)
                countOdd++;
            n = n / 10;
        }
        return countOdd;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = countOddDigit(n);
        System.out.println("Number of odd digits in " + n + " is: " + res);

    }
}