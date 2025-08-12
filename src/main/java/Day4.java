import java.util.*;

public class Day4 {
  public static void selectionSort(int arr[], int n) {
    for (int i = 0; i <= n - 2; i++) {
      int min = i;
      for (int j = i; j <= n - 1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public static void bubbleSort(int arr[], int n){
    for(int i = n-1; i >=1; i--){
      for(int j = 0; j<=i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    ;
    n = sc.nextInt();
    int arr[] = new int[6];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    bubbleSort(arr, n);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}