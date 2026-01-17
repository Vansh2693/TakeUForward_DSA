import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int arr[], int start, int n) {
        if (start == n - 1)
            return;

        int min_idx = start;
        for (int i = start + 1; i < n - 1; i++) {
            if (arr[i] < arr[min_idx]) {
                min_idx = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[min_idx];
        arr[min_idx] = temp;
        selectionSort(arr, start + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 1, 8, 4 };
        selectionSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
