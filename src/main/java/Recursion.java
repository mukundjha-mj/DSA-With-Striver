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
   static int sum = 0;

   static int sumFuncation(int i, int n) {
      if (i > n) {
         return 0;
      }
      sum = sum + i;
      sumFuncation(i + 1, n);
      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = sumFuncation(1, n);
      System.out.println(result);
   }
}