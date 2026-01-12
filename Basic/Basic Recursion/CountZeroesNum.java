public class CountZeroesNum {

    public static int countZeroes(int n) {
        int rem = n % 10;
        if (n == 0)
            return 0;
        return (rem == 0 ? 1 : 0) + countZeroes(n / 10);
    }

    public static void main(String[] args) {
        int num = 9000000;
        int res = countZeroes(num);
        System.out.println(res);
    }
}
