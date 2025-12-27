public class CountOfOddNum{
    public static int countOdd(int[] arr, int n) {
       int count = 0;
       for(int i=0;i<n;i++){
        if(arr[i]%2!=0){
            count++;
        }
       }
       return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = countOdd(arr, 5);
        System.out.println(res);
    }
}