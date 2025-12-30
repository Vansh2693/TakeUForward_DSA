public class SumOfArrElm {
    public static int arraySum(int[] nums) {
        // your code goes here
        return sum(nums, 0);
    }

    private static int sum(int[] nums, int n) {
        if (n == nums.length)
            return 0;

        return nums[n] + sum(nums, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int res = arraySum(arr);
        System.out.println(res);
    }

}