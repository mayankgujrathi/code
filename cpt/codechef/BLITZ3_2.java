import java.util.Scanner;

class CodeChef {
  static void solve(int n, int a, int b) {
    int c = 2 * (180 + n);
    int d = a + b;
    System.out.println(c - d);
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