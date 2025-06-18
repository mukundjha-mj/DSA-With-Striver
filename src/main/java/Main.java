// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  static void pat1(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pat2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pat3(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1);
      }
      System.out.println();
    }
  }

  static void pat4(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1);
      }
      System.out.println();
    }
  }

  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // pat1(n);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      pat4(n);
    }

    sc.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}