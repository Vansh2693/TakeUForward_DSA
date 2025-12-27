import java.util.Scanner;

public class Armstrong {
    public static int countDigits(int n) {
        if (n == 0)
            return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int armNum = 0;
        int orgNum = n;
        int power = countDigits(n);
        while (n > 0) {
            int rem = n % 10;
            armNum += Math.pow(rem, power);
            n /= 10;
        }
        return armNum == orgNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);
    }
}