public class SumOfFirstN {
    public static int NnumbersSum(int N) {
        // your code goes here
        if (N == 1) {
            return 1;
        }
        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {
        int res = NnumbersSum(5);
        System.out.println(res);
    }
}