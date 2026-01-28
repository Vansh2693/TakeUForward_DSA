import java.util.Arrays;

public class BubbleSort {

    static void bubble1(int[] arr, int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble1(arr, r, c + 1);
        } else {
            bubble1(arr, r - 1, 0);
        }

    }

    static void bubble2(int arr[], int n) {

        if (n == 1)
            return;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count += 1;
            }
        }
        if (count == 0)
            return;

        bubble2(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 7, 2, 9 };
        // bubble1(arr, arr.length - 1, 0);
        bubble2(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
