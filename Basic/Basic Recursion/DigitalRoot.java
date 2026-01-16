public class DigitalRoot {
    static int addDigits(int n) {
        if (n < 10)
            return n;

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(666));
    }

}
