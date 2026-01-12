public class RevNum2 {

    public static int reverseNum2(int n) {
        int noOfDigits = (int) (Math.log10(n)) + 1;
        return revHelper(n, noOfDigits);
    }

    private static int revHelper(int n, int noOfDigits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, noOfDigits - 1)) + revHelper(n / 10, noOfDigits - 1);
    }

    public static void main(String[] args) {
        int res = reverseNum2(4321);
        System.out.println(res);
    }
}
