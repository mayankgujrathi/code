import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class CodeChef {
  static void solve(int a, int b) {
    System.out.println(Collections.min(Arrays.asList(a, b)));
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- != 0) {
      solve(scan.nextInt(), scan.nextInt());
    }
    scan.close();
  }
}