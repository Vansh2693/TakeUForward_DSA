public class ReduceNumToZero {
    public static int noOfStepsToReduceToZero(int n) {
        int steps = 0;
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            steps++;
            return steps + noOfStepsToReduceToZero(n / 2);
        } else {
            steps++;
            return steps + noOfStepsToReduceToZero(n - 1);
        }
    }

    public static void main(String[] args) {
        int res = noOfStepsToReduceToZero(10);
        System.out.println(res);
    }
}
