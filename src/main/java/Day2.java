import java.util.*;
import java.math.*;

public class Day2 {

  // public static void count(int n) {
  // int c = 0;
  // int lastdigit;
  // while (n > 0) {
  // lastdigit = n % 10;
  // n = n / 10;
  // c++;
  // }
  // System.out.println("Number of digit are: " + c);

  // }
  // add another method to solve number of digit problem via log10
  // static void count(int n){
  // System.out.println((int)Math.log10(n)+1);
  // }

  // problem 2: Reverse a number
  // static void rev(int n) {
  // boolean isNegative = false;
  // if (n < 0) {
  // isNegative = true;
  // n = n * -1;
  // }
  // int fix = n;
  // int revNum = 0;
  // int lastDigit = 0;
  // while (n > 0) {
  // lastDigit = n % 10;
  // n = n / 10;
  // revNum = (revNum * 10) + lastDigit;
  // }
  // if (isNegative) {
  // System.out.println("Original Number: " + fix);
  // System.out.println("Reverse Number: " + revNum * -1);
  // } else {
  // System.out.println("Original Number: " + fix);
  // System.out.println("Reverse Number: " + revNum);
  // }
  // // }

  // // Problem 3: palindrome number
  // static void palindrome(int n){
  // int fix = n;

  // }

  // problem 3: Palindrome number
  static void palindrome(int n) {
    boolean isNegative = false;
    if (n < 0) {
      isNegative = true;
      n = n * -1;
    }
    int fix = n;
    int revNum = 0;
    int lastDigit = 0;
    while (n > 0) {
      lastDigit = n % 10;
      n = n / 10;
      revNum = (revNum * 10) + lastDigit;
    }
    if(isNegative){
      
    }
    if (fix == revNum) {
      System.out.println(fix + " is Palindrome.");
    } else {
      System.out.println(fix + " is not Palindrome.");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      palindrome(n);
    }
    sc.close();
  }
}