public class LinearSearchRec {

    static boolean LinearSearch(int[] arr, int index, int elm) {

        if (arr[index] != elm && index >= arr.length - 1)
            return false;

        if (arr[index] == elm)
            return true;

        return LinearSearch(arr, index + 1, elm);
    }

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 70 };
        int elm = 876;
        System.out.println(LinearSearch(arr, 0, elm));
    }
}
