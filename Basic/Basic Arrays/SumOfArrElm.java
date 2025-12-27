import java.util.Scanner;

public class SumOfArrElm {
  public static int sum(int arr[], int n) {
      int sum = 0;
      for(int i=0;i<n;i++){
        sum+=arr[i];
      }
      return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int n = s.nextInt();
        int res = sum(arr, n);
        System.out.println(res);
    }
}
