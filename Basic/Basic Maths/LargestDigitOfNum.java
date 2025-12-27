import java.util.Scanner;

public class LargestDigitOfNum {
    public static int largestDigit(int n) {
        int maxNum = 0;
        while (n > 0) {
            int rem = n % 10;
            maxNum = Math.max(maxNum, rem);
            n /= 10;
        }

        return maxNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = largestDigit(n);
        System.out.println(res);
    }
}
