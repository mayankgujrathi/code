import java.util.*;

class CodeChef {
  static void solve(int x, int y) {
    if (x + y > 6)
      System.out.println("YES");
    else
      System.out.println("NO");
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