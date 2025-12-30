public class Factorial {
    public static long factorial(int n) {
        //your code goes here
        if(n==1 || n==0) return 1;

        return n*factorial(n-1);
    
    }

    public static void main(String[] args) {
        long res = factorial(6);
        System.out.println(res);
    }
}