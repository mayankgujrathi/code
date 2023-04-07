import java.util.Scanner;

class CodeChef {
  static void solve(int x, int y) {
    if ((x + 2 * y) % 2 != 0 || (x < 2 && y % 2 != 0))
      System.out.println("NO");
    else
      System.out.println("YES");
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
