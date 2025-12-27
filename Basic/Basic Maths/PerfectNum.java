import java.util.Scanner;

public class PerfectNum {
    public static boolean isPerfect(int n) {
        int divisorSum = 0;
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                divisorSum+=i;
            }
        }

        return divisorSum==n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean res = isPerfect(n);
        System.out.println(res);
    }
}