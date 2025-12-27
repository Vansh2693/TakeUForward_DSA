import java.util.Scanner;

public class PalindromeNum {
    public static boolean palindrome(int n) {
        int revNum = 0;
        int orgNum = n;
        while(n>0){
            int rem = n%10;
            revNum = revNum*10 + rem;
            n/=10;
        }

        return revNum==orgNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean res = palindrome(n);
        System.out.println(res);
    }
}