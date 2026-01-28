
public class CheckIfArrIsSorted {

    static boolean CheckSortedArr(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && CheckSortedArr(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr2[] = { 1, 1, 1 };

        System.out.println(CheckSortedArr(arr2, 0));
    }
}
