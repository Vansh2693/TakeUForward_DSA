import java.util.Scanner;

public class PrimeTillN {
    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static int primeUptoN(int n) {
        int countPrime = 0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                countPrime++;
            }
        }
        return countPrime;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = primeUptoN(n);
        System.out.println(res);
    }
}