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
   static void f(int i, int n) {
      if (i < 1)
         return;
      System.out.println(i);
      f(i - 1, n);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      f(n, n);
   }
}