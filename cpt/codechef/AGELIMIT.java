import java.util.*;

class CodeChef {
  static void solve(int x, int y, int a) {
    if (a >= x && a < y)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- != 0) {
      solve(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }
    scan.close();
  }
}