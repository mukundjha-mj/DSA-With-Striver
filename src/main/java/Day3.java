import java.util.*;

public class Day3 {
  // Problem 1: Armstrong Number
  // static void armstrong(int n) {

  // int original = n;
  // int sum = 0;
  // int lastDigit;
  // while (n > 0) {
  // lastDigit = n % 10;
  // sum = sum + (lastDigit * lastDigit * lastDigit);
  // n = n / 10;
  // }

  // if (original == sum) {
  // System.out.println(original + " is an Armstrong Number.");
  // } else {
  // System.out.println(original + " is not an Armstrong Number.");
  // }
  // }

  // Problem 2: Print All Divisors
  // static void printAllDivisors(int n){
  // System.out.print(n + ": ");
  // for(int i =1; i<=n; i++){
  // if(n % i == 0){
  // System.out.print(i+", ");
  // }
  // }
  // System.out.println();
  // }

  // Problem 2: Print ALl Divisors with O(√n + (no of factors * log(no of
  // factors))
  // static void printAllDivisors(int n) {
  // System.out.print(n + ": ");
  // List<Integer> ls = new ArrayList<Integer>();
  // // O(sqrt(n))
  // for (int i = 1; i * i <= n; i++) {
  // if (n % i == 0) {
  // ls.add(i);
  // if ((n / i) != i) {
  // ls.add(n / i);
  // }
  // }
  // }
  // // O(no of factors * log(no of factors)): n is the number of factors
  // Collections.sort(ls);
  // // O(number of factors)
  // for (int l : ls) {
  // System.out.print(l + ", ");
  // }
  // System.out.println();
  // }

  // Problem 3: Prime Number
  // static void primeNumber(int n) {
  // int count = 0;
  // for (int i = 1; i * i <= n; i++) {
  // if (n % i == 0) {
  // count++;
  // if (n / i != i) {
  // count++;
  // }
  // }
  // }
  // if (count == 2) {
  // System.out.println(n + " is a Prime Number.");
  // } else {
  // System.out.println((n + " is not a Prime Number."));
  // }
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      // primeNumber(n);
    }
    sc.close();
  }
}