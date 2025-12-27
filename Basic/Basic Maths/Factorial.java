import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int factProd = 1;
        for(int i=2;i<=n;i++){
            factProd = factProd*i;
        }
        return factProd;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
}