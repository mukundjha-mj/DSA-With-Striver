import java.util.*;

public class Day3 {
  // Problem 1: Armstrong Number
  // static void armstrong(int n) {
    
  //   int original = n;
  //   int sum = 0;
  //   int lastDigit;
  //   while (n > 0) {
  //     lastDigit = n % 10;
  //     sum = sum + (lastDigit * lastDigit * lastDigit);
  //     n = n / 10;
  //   }
    
  //   if (original == sum) {
  //     System.out.println(original + " is an Armstrong Number.");
  //   } else {
  //     System.out.println(original + " is not an Armstrong Number.");
  //   }
  // }

  // Problem 2: Print All Divisors
  static void printAllDivisors(int n){
    System.out.print(n + ": ");
    for(int i =1; i<=n; i++){
      if(n % i == 0){
        System.out.print(i+", ");
      } 
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      printAllDivisors(n);
    }
    sc.close();
  }
}