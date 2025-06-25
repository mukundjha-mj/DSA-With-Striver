public class Recursion {
   static int count = 1;
  static void f() {
    if(count == 4){
      return;
    }
    System.out.println(count);
    count++;
    f();
  }

  public static void main(String[] args) {
    f();
  }
}