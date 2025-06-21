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

  // probelm 2: Reverse a number
  static void rev(int n) {
    int fix = n;
    int revNum = 0;
    int lastDigit = 0;
    while (n > 0) {
      lastDigit = n % 10;
      n = n / 10;
      revNum = (revNum * 10) + lastDigit;
    }
    System.out.println("Original Number: " + fix);
    System.out.println("Reverse Number: " + revNum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      rev(n);
    }
    sc.close();
  }
}