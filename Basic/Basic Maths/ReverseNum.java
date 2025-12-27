import java.util.Scanner;

public class ReverseNum {
    public static int reverseNumber(int n) {
        int revNum = 0;

        while(n>0){
            int rem = n%10;
            revNum = revNum*10 + rem;
            n/=10;
        }

        return revNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = reverseNumber(n);
        System.out.println(res);
    }
}