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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // pat1(n);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n;
      n = sc.nextInt();
      pat1(n);
    }

    sc.close();
  }

}