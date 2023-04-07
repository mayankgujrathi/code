import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class CodeChef {
  static void solve(int x, int y) {
    System.out.println(Collections.min(Arrays.asList(x * 3, y * 2)));
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