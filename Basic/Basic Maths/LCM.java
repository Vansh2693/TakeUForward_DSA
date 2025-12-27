import java.util.Scanner;

public class LCM {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int Lcm(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int res = Lcm(a, b);
        System.out.println(res);
    }
}