import java.util.Scanner;

class CodeChef {
  static void solve(int x) {
    if (x > 100)
      x -= 10;
    System.out.println(x);
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