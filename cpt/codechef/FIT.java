import java.util.Scanner;

class CodeChef {
  static void solve(int x) {
    System.out.println(2 * 5 * x);
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