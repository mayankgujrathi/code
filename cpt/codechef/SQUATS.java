import java.util.*;

class CodeChef {
  static void solve(int x) {
    System.out.println(x * 15);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- != 0) {
      solve(scan.nextInt());
    }
    scan.close();
  }
}