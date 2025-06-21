import java.util.*;
import java.math.*;

public class Day2 {

  // public static void count(int n) {
  //   int c = 0;
  //   int lastdigit;
  //   while (n > 0) {
  //     lastdigit = n % 10;
  //     n = n / 10;
  //     c++;
  //   }
  //   System.out.println("Number of digit are: " + c);

  // }
  // add another method to solve number of digit problem via log10
  static void count(int n){
    System.out.println((int)Math.log10(n)+1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      count(n);
    }
    sc.close();
  }
}