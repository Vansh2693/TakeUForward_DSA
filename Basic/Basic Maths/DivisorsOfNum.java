import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfNum {
    public static int[] divisors(int n) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                intList.add(i);
            }
        }

        int[] ans = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            ans[i] = intList.get(i);
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] res = divisors(n);
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}