import java.util.*;

public class Recursion {
   // static int count = 1;

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

   static void f(int i, int n) {
      if (n < i) {
         return;
      }
      f(i + 1, n);
      System.out.println(i);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      f(1, n);
   }
}