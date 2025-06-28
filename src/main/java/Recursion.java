import java.util.*;

public class Recursion {
   // static int count = 1;

   // DAY 1
   // Started Recursion in Java with Striver
   // static void f() {
   // if(count == 4){
   // return;
   // }
   // System.out.println(count);
   // count++;
   // f();
   // }

   // Problem 1: Print name N times using Recursion
   // static void f(int i, int n) {
   // if (i > n) {
   // return;
   // }
   // System.out.println("Mukund");
   // f(i+1, n);
   // }

   // Problem 2: Print lineraly from 1 to n
   // static void f(int i, int n) {
   // if (i > n) {
   // return;
   // }
   // System.out.println(i);
   // f(i + 1, n);
   // }

   // Problem 3: Print in terms of n->1
   // static void f(int i, int n) {
   // if (i < 1)
   // return;
   // System.out.println(i);
   // f(i - 1, n);
   // }

   // Problem 4: Print lineraly from 1 to n (without using i+1)
   // static void f(int i, int n) {
   // if (i < 1) {
   // return;
   // }
   // f(i - 1, n);
   // System.out.println(i);
   // }

   // Problem 5: Print lineraly from N -> 1 (without using i - 1)
   // static void f(int i, int n) {
   // if (n < i) {
   // return;
   // }
   // f(i + 1, n);
   // System.out.println(i);
   // }

   // DAY 2

   // Problem 1: Sum of first N Number
   // static int sum = 0;
   // static int sumFuncation(int i, int n) {
   // if (i > n) {
   // return 0;
   // }
   // sum = sum + i;
   // sumFuncation(i + 1, n);
   // return sum;
   // }

   // Problem 2: Factorial of N numbers
   // int result = 1;
   // static int Factorial(int n){
   // if(n == 0){
   // return 1;
   // }
   // return n * Factorial(n - 1);
   // }

   // DAY 3

   // Problem 1: Reverse an Array
   // static void revArr(int i, int arr[], int n) {
   // if (i >= n / 2) {
   // return;
   // }
   // int temp = arr[i];
   // arr[i] = arr[n - i - 1];
   // arr[n - i - 1] = temp;
   // revArr(i + 1, arr, n);

   // }

   // Problem 2: Check if a string is palindrome or not
   static boolean palindrome(int i, String s) {
      if (i >= s.length() / 2)
         return true;
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
         return false;
      }
      return palindrome(i + 1, s);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = "madam";
      System.out.println(palindrome(0, s));
   }
}