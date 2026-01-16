public class ReverseArrRec {

    static int[] reverseArray(int nums[]) {
        revArr(nums, 0, nums.length - 1);
        return nums;
    }

    private static void revArr(int arr[], int low, int high) {

        if (low >= high)
            return;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        revArr(arr, low + 1, high - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 50 };
        reverseArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
